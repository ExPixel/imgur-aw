package com.github.expixel.imgur.models.special;

import com.github.expixel.imgur.models.response.ImgurGalleryAlbum;
import com.github.expixel.imgur.models.response.ImgurGalleryImage;

/**
 * Can be a gallery image OR album.
 * @author ExPixel
 */
public abstract class ImgurGalleryItem {
	public ImgurGalleryImage asImage() {
		if(this instanceof ImgurGalleryImage) {
			return ((ImgurGalleryImage) this);
		}
		return null;
	}

	public ImgurGalleryAlbum asAlbum() {
		if(this instanceof ImgurGalleryAlbum) {
			return ((ImgurGalleryAlbum) this);
		}
		return null;
	}

	public abstract boolean isAlbum();
}
