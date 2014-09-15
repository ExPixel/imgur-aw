package com.github.expixel.imgur.models.response;

import com.github.expixel.imgur.models.special.ImgurGalleryItem;

/**
 * @author ExPixel
 */
public class ImgurTag {
	private String name;
	private int followers;
	private int total_items;
	private ImgurTagFollower[] following;
	private ImgurGalleryItem items;

	public String getName() {
		return name;
	}

	public int getFollowers() {
		return followers;
	}

	public int getTotalItems() {
		return total_items;
	}

	public ImgurTagFollower[] getFollowing() {
		return following;
	}

	public ImgurGalleryItem getItems() {
		return items;
	}

	public static class ImgurTagFollower {
		private String id;
		private String name;
	}
}
