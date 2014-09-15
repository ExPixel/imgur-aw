package com.github.expixel.imgur;

import com.github.expixel.imgur.models.response.ImgurError;

/**
 * @author ExPixel
 */
public class ImgurException extends RuntimeException {
	private final ImgurError imgurError;

	public ImgurException(ImgurError error, Throwable cause) {
		super("Error " + error.getStatus() + " while making " + error.getMethod() + " request to " +
				error.getRequest() + ": " + error.getError(), cause);
		this.imgurError = error;
	}

	public ImgurError getImgurError() {
		return imgurError;
	}

	public String getImgurErrorMessage() {
		return imgurError.getError();
	}

	public int getImgurStatus() {
		return imgurError.getStatus();
	}

	public String getImgurRequest() {
		return imgurError.getRequest();
	}

	public String getImgurMethod() {
		return imgurError.getMethod();
	}
}
