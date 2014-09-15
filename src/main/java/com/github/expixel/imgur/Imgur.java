package com.github.expixel.imgur;

import com.github.expixel.imgur.endpoints.*;
import com.github.expixel.imgur.models.response.ImgurAuthData;
import com.google.gson.Gson;
import retrofit.RestAdapter;

/**
 * @author ExPixel
 */
public class Imgur {
	private String clientId;
	private String clientSecret;
	private String userAgent;
	private ImgurAuthData authData;

	private ImgurAuthEndpoint auth;
	private ImgurAccountEndpoint account;
	private ImgurAlbumEndpoint album;
	private ImgurCommentEndpoint comment;
	private ImgurConversationEndpoint conversation;
	private ImgurCustomGalleryEndpoint customGallery;
	private ImgurGalleryEndpoint gallery;
	private ImgurImageEndpoint image;
	private ImgurMemegenEndpoint memegen;
	private ImgurNotificationEndpoint notification;

	private Gson gson = new Gson();

	public Imgur(String clientId, String clientSecret, String userAgent) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.userAgent = userAgent;
		this.init();
	}

	private void init() {
		RestAdapter adapter = new RestAdapter.Builder()
				.setEndpoint("https://api.imgur.com")
				.setConverter(new ImgurResponseConverter())
				.setRequestInterceptor(new ImgurRequestInterceptor(this))
				.setErrorHandler(new ImgurErrorHandler(this, gson))
				.setLogLevel(RestAdapter.LogLevel.BASIC)
				.build();
		account = adapter.create(ImgurAccountEndpoint.class);
		album = adapter.create(ImgurAlbumEndpoint.class);
		comment = adapter.create(ImgurCommentEndpoint.class);
		conversation = adapter.create(ImgurConversationEndpoint.class);
		customGallery = adapter.create(ImgurCustomGalleryEndpoint.class);
		gallery = adapter.create(ImgurGalleryEndpoint.class);
		image = adapter.create(ImgurImageEndpoint.class);
		memegen = adapter.create(ImgurMemegenEndpoint.class);
		notification = adapter.create(ImgurNotificationEndpoint.class);
		auth = adapter.create(ImgurAuthEndpoint.class);
	}

	/**
	 * Exchange the refresh token for a new access token.
	 */
	public void refresh() {
		if (this.authData != null) {
			long currentTime = System.currentTimeMillis();
			if (this.authData.getLastRefreshTime() + (this.authData.getExpiresIn() * 1000) > currentTime) {
				System.out.println("REFRESHING!");
				doRefresh();
			}
		}
	}

	private void doRefresh() {
		if(this.authData != null)
			authData = auth.refresh(this.clientId, this.clientSecret, "refresh_token", this.authData.getRefreshToken());
	}

	public void authorizeWithPin(String pin) {
		authData = auth.exchangePin(this.clientId, this.clientSecret, "pin", pin);
	}

//	public void authorizeWithAuthorizationCode(String authorizationCode) {
//		authData = auth.exchangePin(this.clientId, this.clientSecret, "authorization_code", authorizationCode);
//	}

	public String getPinAuthorizationURL() {
		return "https://api.imgur.com/oauth2/authorize?client_id=" + this.clientId + "&response_type=pin";
	}

	/**=
	 * @return The client ID being used by this.
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * Sets the user agent.
	 * @param userAgent The new user agent to use.
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**=
	 * @return The user agent sent with requests.
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @return Account endpoint.
	 */
	public ImgurAccountEndpoint account() {
		refresh();
		return account;
	}

	/**
	 * @return Album endpoint.
	 */
	public ImgurAlbumEndpoint album() {
		refresh();
		return album;
	}

	/**
	 * @return Comment endpoint.
	 */
	public ImgurCommentEndpoint comment() {
		refresh();
		return comment;
	}

	/**
	 * @return Conversation endpoint.
	 */
	public ImgurConversationEndpoint conversation() {
		refresh();
		return conversation;
	}

	/**
	 * @return Custom gallery endpoint.
	 */
	public ImgurCustomGalleryEndpoint customGallery() {
		refresh();
		return customGallery;
	}

	/**
	 * @return Gallery endpoint.
	 */
	public ImgurGalleryEndpoint gallery() {
		refresh();
		return gallery;
	}

	/**
	 * @return Image endpoint.
	 */
	public ImgurImageEndpoint image() {
		refresh();
		return image;
	}

	/**
	 * @return Memegen endpoint.
	 */
	public ImgurMemegenEndpoint memegen() {
		refresh();
		return memegen;
	}

	/**
	 * @return Notification endpoint.
	 */
	public ImgurNotificationEndpoint notification() {
		refresh();
		return notification;
	}

	public ImgurAuthData getAuthData() {
		return authData;
	}

	public void setAuthData(ImgurAuthData authData) {
		refresh();
		this.authData = authData;
	}
}
