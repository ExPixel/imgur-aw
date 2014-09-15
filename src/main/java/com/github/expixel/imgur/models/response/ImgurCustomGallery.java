package com.github.expixel.imgur.models.response;

import com.github.expixel.imgur.models.special.ImgurGalleryItem;

/**
 * @author ExPixel
 */
public class ImgurCustomGallery {
	private String id;
	private String name;
	private long datetime;
	private String account_url;
	private String link;
	private String[] tags;
	private int item_count;
	private ImgurGalleryItem[] items;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getDatetime() {
		return datetime;
	}

	public String getAccountUrl() {
		return account_url;
	}

	public String getLink() {
		return link;
	}

	public String[] getTags() {
		return tags;
	}

	public int getItemCount() {
		return item_count;
	}

	public ImgurGalleryItem[] getItems() {
		return items;
	}
}
