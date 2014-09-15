package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurError {
	private ImgurErrorData data;
	private boolean success;
	private int status;

	public boolean isSuccess() {
		return success;
	}

	public int getStatus() {
		return status;
	}

	public String getError() {
		return data.getError();
	}

	public String getRequest() {
		return data.getRequest();
	}

	public String getMethod() {
		return data.getMethod();
	}

	@Override
	public String toString() {
		return "ImgurError{" +
				"data=" + data +
				", success=" + success +
				", status=" + status +
				'}';
	}

	public static class ImgurErrorData {
		private String error;
		private String request;
		private String method;

		public String getError() {
			return error;
		}

		public String getRequest() {
			return request;
		}

		public String getMethod() {
			return method;
		}

		@Override
		public String toString() {
			return "ImgurErrorData{" +
					"error='" + error + '\'' +
					", request='" + request + '\'' +
					", method='" + method + '\'' +
					'}';
		}
	}
}
