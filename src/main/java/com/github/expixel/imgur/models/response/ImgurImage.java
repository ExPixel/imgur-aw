package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurImage {
	private String id;
	private String title;
	private String description;
	private long datetime;
	private String type;
	private boolean animated;
	private int width;
	private int height;
	private long size;
	private int views;
	private long bandwidth;
	private String deletehash;
	private String section;
	private String link;
	private boolean favorite;
	private boolean nsfw;
	private String vote;
	private String account_url;

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public long getDatetime() {
		return datetime;
	}

	public String getType() {
		return type;
	}

	public boolean isAnimated() {
		return animated;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public long getSize() {
		return size;
	}

	public int getViews() {
		return views;
	}

	public long getBandwidth() {
		return bandwidth;
	}

	public String getDeletehash() {
		return deletehash;
	}

	public String getSection() {
		return section;
	}

	public String getLink() {
		return link;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public boolean isNsfw() {
		return nsfw;
	}

	public String getVote() {
		return vote;
	}

	public String getAccountUrl() {
		return account_url;
	}
}
