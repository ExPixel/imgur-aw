package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurTagVote {
	private int ups;
	private int downs;
	private String name;
	private String author;

	public int getUps() {
		return ups;
	}

	public int getDowns() {
		return downs;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}
