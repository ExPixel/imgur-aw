package com.github.expixel.imgur;

import com.github.expixel.imgur.models.response.ImgurError;
import com.google.gson.Gson;
import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author ExPixel
 */
public class ImgurErrorHandler implements ErrorHandler {
	private final Gson gson;
	private Imgur imgur;

	public ImgurErrorHandler(Imgur imgur, Gson gson) {
		this.imgur = imgur;
		this.gson = gson;
	}

	@Override
	public Throwable handleError(RetrofitError retrofitError) {
		Response response = retrofitError.getResponse();
		InputStream in = null;
		try {
			in = response.getBody().in();
			ImgurError e = gson.fromJson( new InputStreamReader(in), ImgurError.class );
			if(e != null) {
				return new ImgurException(e, retrofitError);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return retrofitError;
	}
}
