package com.github.expixel.imgur.models.response;

import com.github.expixel.imgur.models.special.ImgurGalleryItem;

/**
 * @author ExPixel
 */
public class ImgurGalleryAlbum extends ImgurGalleryItem {
	private String id;
	private String title;
	private String description;
	private long datetime;
	private String cover;
	private int cover_width;
	private int cover_height;
	private String account_url;
	private long account_id;
	private String privacy;
	private String layout;
	private int views;
	private String link;
	private int ups;
	private int downs;
	private int score;

	// obviously false:
	// private boolean is_album;

	private String vote;
	private boolean favorite;
	private boolean nsfw;
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

	public long getAccountId() {
		return account_id;
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

	public int getUps() {
		return ups;
	}

	public int getDowns() {
		return downs;
	}

	public int getScore() {
		return score;
	}

	public String getVote() {
		return vote;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public boolean isNsfw() {
		return nsfw;
	}

	public int getImagesCount() {
		return images_count;
	}

	public ImgurImage[] getImages() {
		return images;
	}

	@Override
	public boolean isAlbum() {
		return true;
	}
}
