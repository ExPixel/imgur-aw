package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurAlbum {
	private String id;
	private String title;
	private String description;
	private long datetime;
	private String cover;
	private int cover_width;
	private int cover_height;
	private String account_url;
	private String privacy;
	private String layout;
	private int views;
	private String link;
	private boolean favorite;
	private boolean nsfw;
	private String section;
	private int order;
	private String deletehash;
	private int images_count;
	private ImgurImage[] images;

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

	public String getCover() {
		return cover;
	}

	public int getCoverWidth() {
		return cover_width;
	}

	public int getCoverHeight() {
		return cover_height;
	}

	public String getAccountUrl() {
		return account_url;
	}

	public String getPrivacy() {
		return privacy;
	}

	public String getLayout() {
		return layout;
	}

	public int getViews() {
		return views;
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

	public String getSection() {
		return section;
	}

	public int getOrder() {
		return order;
	}

	public String getDeletehash() {
		return deletehash;
	}

	public int getImagesCount() {
		return images_count;
	}

	public ImgurImage[] getImages() {
		return images;
	}
}
