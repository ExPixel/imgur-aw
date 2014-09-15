package com.github.expixel.imgur.models.request;

/**
 * @author ExPixel
 */
public class ImgurCommentPost {
	private String image_id;
	private String comment;
	private String parent_id;

	private ImgurCommentPost(String image_id, String comment, String parent_id) {
		this.image_id = image_id;
		this.comment = comment;
		this.parent_id = parent_id;
	}

	public static class Builder {
		private String image_id;
		private String comment;
		private String parent_id;

		public Builder setImage_id(String image_id) {
			this.image_id = image_id;
			return this;
		}

		public Builder setComment(String comment) {
			this.comment = comment;
			return this;
		}

		public Builder setParent_id(String parent_id) {
			this.parent_id = parent_id;
			return this;
		}

		public ImgurCommentPost build() {
			return new ImgurCommentPost(image_id, comment, parent_id);
		}
	}
}
