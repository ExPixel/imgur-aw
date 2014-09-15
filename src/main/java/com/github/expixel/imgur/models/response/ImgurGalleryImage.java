package com.github.expixel.imgur.models.response;

import com.github.expixel.imgur.models.special.ImgurGalleryItem;

/**
 * @author ExPixel
 */
public class ImgurGalleryImage extends ImgurGalleryItem {
	private String id;
	private String title;
	private String description;
	private long datetime;
	private String type;
	private boolean animated;
	private int width;
	private int height;
	private long bandwidth;
	private int views;
	private String deletehash;
	private String link;
	private String vote;
	private boolean favorite;
	private boolean nsfw;
	private String section;
	private String account_url;
	private long account_id;
	private int ups;
	private int downs;
	private int score;

	// obviously false:
	// private boolean is_album;


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

	public long getBandwidth() {
		return bandwidth;
	}

	public int getViews() {
		return views;
	}

	public String getDeletehash() {
		return deletehash;
	}

	public String getLink() {
		return link;
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

	public String getSection() {
		return section;
	}

	public String getAccountRrl() {
		return account_url;
	}

	public long getAccountId() {
		return account_id;
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

	@Override
	public boolean isAlbum() {
		return false;
	}
}
