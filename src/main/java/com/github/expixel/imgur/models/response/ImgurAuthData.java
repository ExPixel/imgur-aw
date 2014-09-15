package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurAuthData {
	private String access_token;
	private String refresh_token;
	private int expires_in;
	private String token_type;
	private String account_username;
	private long lastRefreshTime;

	public ImgurAuthData() {
		lastRefreshTime = System.currentTimeMillis();
	}

	public String getAccessToken() {
		return access_token;
	}

	public String getRefreshToken() {
		return refresh_token;
	}

	public int getExpiresIn() {
		return expires_in;
	}

	public String getTokenType() {
		return token_type;
	}

	public String getAccountUsername() {
		return account_username;
	}

	public long getLastRefreshTime() {
		return lastRefreshTime;
	}

	@Override
	public String toString() {
		return "ImgurAuthData{" +
				"access_token='" + access_token + '\'' +
				", refresh_token='" + refresh_token + '\'' +
				", expires_in=" + expires_in +
				", token_type='" + token_type + '\'' +
				", account_username='" + account_username + '\'' +
				", lastRefreshTime=" + lastRefreshTime +
				'}';
	}
}
