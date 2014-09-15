package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurAccountSettings {
	private String email;
	private boolean high_quality;
	private boolean public_images;
	private boolean album_privacy;
	private long pro_expiration;
	private boolean accepted_gallery_terms;
	private String[] active_emails;
	private boolean messaging_enabled;
	private BlockedUser[] blocked_users;

	public String getEmail() {
		return email;
	}

	public boolean isHighQuality() {
		return high_quality;
	}

	public boolean isPublicImages() {
		return public_images;
	}

	public boolean isAlbumPrivacy() {
		return album_privacy;
	}

	public long getProExpiration() {
		return pro_expiration;
	}

	public boolean isAcceptedGalleryTerms() {
		return accepted_gallery_terms;
	}

	public String[] getActiveEmails() {
		return active_emails;
	}

	public boolean isMessagingEnabled() {
		return messaging_enabled;
	}

	public BlockedUser[] getBlockedUsers() {
		return blocked_users;
	}

	public static class BlockedUser {
		private long blocked_id;
		private String blocked_url;

		public long getBlockedId() {
			return blocked_id;
		}

		public String getBlockedUrl() {
			return blocked_url;
		}
	}
}
