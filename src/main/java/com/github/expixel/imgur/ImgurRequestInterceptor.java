package com.github.expixel.imgur;

import retrofit.RequestInterceptor;

/**
 * @author ExPixel
 */
public class ImgurRequestInterceptor implements RequestInterceptor {
	private Imgur imgur;

	public ImgurRequestInterceptor(Imgur imgur) {
		this.imgur = imgur;
	}

	@Override
	public void intercept(RequestFacade requestFacade) {
		if (imgur.getUserAgent() != null) requestFacade.addHeader("User-Agent", imgur.getUserAgent());

		// https://api.imgur.com/oauth2#making_request
		if (imgur.getAuthData() != null) requestFacade.addHeader("Authorization",
				"Bearer " + this.imgur.getAuthData().getAccessToken()); // "Authorization: Bearer ACCESS_TOKEN"
		else
			requestFacade.addHeader("Authorization", "Client-ID " + imgur.getClientId());
	}
}
