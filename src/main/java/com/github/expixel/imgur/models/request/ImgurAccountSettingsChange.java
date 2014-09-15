package com.github.expixel.imgur.models.request;

/**
 * @author ExPixel
 */
public class ImgurAccountSettingsChange {
	private String bio;
	private boolean public_images;
	private boolean messaging_enabled;
	private String album_privacy;
	private boolean accepted_gellery_items;

	/**
	 * This might break the API. Just sayin'.
	 * todo Force a necessary refresh somehow if this is changed.
	 */
	private String username;

	private ImgurAccountSettingsChange(String bio, boolean public_images, boolean messaging_enabled, String album_privacy, boolean accepted_gellery_items, String username) {
		this.bio = bio;
		this.public_images = public_images;
		this.messaging_enabled = messaging_enabled;
		this.album_privacy = album_privacy;
		this.accepted_gellery_items = accepted_gellery_items;
		this.username = username;
	}

	public static class Builder {
		private String bio;
		private boolean public_images;
		private boolean messaging_enabled;
		private String album_privacy;
		private boolean accepted_gellery_items;
		private String username;

		public Builder setBio(String bio) {
			this.bio = bio;
			return this;
		}

		public Builder setPublic_images(boolean public_images) {
			this.public_images = public_images;
			return this;
		}

		public Builder setMessaging_enabled(boolean messaging_enabled) {
			this.messaging_enabled = messaging_enabled;
			return this;
		}

		public Builder setAlbum_privacy(String album_privacy) {
			this.album_privacy = album_privacy;
			return this;
		}

		public Builder setAccepted_gellery_items(boolean accepted_gellery_items) {
			this.accepted_gellery_items = accepted_gellery_items;
			return this;
		}

		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}

		public ImgurAccountSettingsChange build() {
			return new ImgurAccountSettingsChange(bio, public_images, messaging_enabled, album_privacy, accepted_gellery_items, username);
		}
	}
}
