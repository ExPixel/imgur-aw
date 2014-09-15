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
}
