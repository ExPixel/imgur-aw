package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurGalleryProfile {
	private int total_gallery_comments;
	private int total_gallery_favorites;
	private int total_gallery_submissions;
	private ImgurTrophy[] trophies;

	public int getTotalGalleryComments() {
		return total_gallery_comments;
	}

	public int getTotalGalleryFavorites() {
		return total_gallery_favorites;
	}

	public int getTotalGallerySubmissions() {
		return total_gallery_submissions;
	}

	public ImgurTrophy[] getTrophies() {
		return trophies;
	}
}
