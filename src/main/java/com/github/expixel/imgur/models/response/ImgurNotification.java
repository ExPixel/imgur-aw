package com.github.expixel.imgur.models.response;

import com.google.gson.JsonElement;

/**
 * @author ExPixel
 */
public class ImgurNotification {
	private long id;
	private long account_id;
	private boolean viewed;
	private JsonElement metaData;

	public long getId() {
		return id;
	}

	public long getAccountId() {
		return account_id;
	}

	public boolean isViewed() {
		return viewed;
	}

	public JsonElement getMetaData() {
		return metaData;
	}
}
