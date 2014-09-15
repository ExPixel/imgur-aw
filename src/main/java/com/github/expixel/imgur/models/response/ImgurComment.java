package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurComment {
	private String id;
	private String image_id;
	private String comment;
	private String author;
	private long author_id;
	private boolean on_album;
	private String album_cover;
	private int ups;
	private int downs;
	private double points;
	private long datetime;
	private long parent_id;
	private boolean deleted;
	private String vote;
	private ImgurComment[] children;

	public String getId() {
		return id;
	}

	public String getImageId() {
		return image_id;
	}

	public String getComment() {
		return comment;
	}

	public String getAuthor() {
		return author;
	}

	public long getAuthorId() {
		return author_id;
	}

	public boolean isOnAlbum() {
		return on_album;
	}

	public String getAlbumCover() {
		return album_cover;
	}

	public int getUps() {
		return ups;
	}

	public int getDowns() {
		return downs;
	}

	public double getPoints() {
		return points;
	}

	public long getDatetime() {
		return datetime;
	}

	public long getParentId() {
		return parent_id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public String getVote() {
		return vote;
	}

	public ImgurComment[] getChildren() {
		return children;
	}
}
