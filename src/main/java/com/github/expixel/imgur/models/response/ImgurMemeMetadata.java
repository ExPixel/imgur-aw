package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurMemeMetadata {
	private String meme_name;
	private String top_text;
	private String bottom_text;
	private String bg_image;

	public String getMemename() {
		return meme_name;
	}

	public String getTopText() {
		return top_text;
	}

	public String getBottomText() {
		return bottom_text;
	}

	public String getBgImage() {
		return bg_image;
	}
}
