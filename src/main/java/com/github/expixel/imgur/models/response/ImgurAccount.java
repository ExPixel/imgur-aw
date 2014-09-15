package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurAccount {
	private long id;
	private String url;
	private String bio;
	private double reputation;
	private long created;
	private long pro_expiration;

	/**
	 * @return The account ID for the user.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return The account username, will be the same as requested.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return A basic description the user has filled out.
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @return The reputation for the account, int its numerical format.
	 */
	public double getReputation() {
		return reputation;
	}

	/**
	 * @return The epoch time of account creation.
	 */
	public long getCreated() {
		return created;
	}

	/**
	 * @return False if not a pro user, their expiration date if they are.
	 */
	public long getProExpiration() {
		return pro_expiration;
	}
}
