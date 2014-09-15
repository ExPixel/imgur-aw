package com.github.expixel.imgur.models.request;

/**
 * @author ExPixel
 */
public class ImgurAlbumUpdate {
	private String[] ids;
	private String title;
	private String description;
	private String privacy;
	private String layout;
	private String cover;

	public String[] getIds() {
		return ids;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getPrivacy() {
		return privacy;
	}

	public String getLayout() {
		return layout;
	}

	public String getCover() {
		return cover;
	}

	private ImgurAlbumUpdate(String[] ids, String title, String description, String privacy, String layout, String cover) {
		this.ids = ids;
		this.title = title;
		this.description = description;
		this.privacy = privacy;
		this.layout = layout;
		this.cover = cover;
	}

	public static class Builder {
		private String[] ids;
		private String title;
		private String description;
		private String privacy;
		private String layout;
		private String cover;

		public Builder setIds(String[] ids) {
			this.ids = ids;
			return this;
		}

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder setPrivacy(String privacy) {
			this.privacy = privacy;
			return this;
		}

		public Builder setLayout(String layout) {
			this.layout = layout;
			return this;
		}

		public Builder setCover(String cover) {
			this.cover = cover;
			return this;
		}

		public ImgurAlbumUpdate build() {
			return new ImgurAlbumUpdate(ids, title, description, privacy, layout, cover);
		}
	}
}
