package com.github.expixel.imgur.endpoints;

import com.github.expixel.imgur.models.special.ImgurGalleryItem;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Implements API methods that can be found here: https://api.imgur.com/endpoints/gallery
 * @author ExPixel
 */
public interface ImgurGalleryEndpoint {
	@GET("/3/gallery/{section}/{sort}/{page}")
	public ImgurGalleryItem[] getGallery(@Path("section") String section,
	                                     @Path("sort") String sort,
	                                     @Path("page") int page);


	@GET("/3/gallery/{section}/{sort}/{window}/{page}")
	public ImgurGalleryItem[] getGalleryTop(@Path("section") String section,
	                                        @Path("sort") String sort,
	                                        @Path("window") String window,
	                                        @Path("page") int page);

	// todo meme shit.

	// todo subreddit galleries & images (for all of your softcore porn.)

	// todo tag searches. all 4 of them that I don't feel like writing very quickly.

	// todo like...all searches :| Namely the one GallerySearch method.

	// todo who browses on random anywya?

	// todo share to gallery. I'll never make it so why should I give you a chance?

	// todo Remove from gallery. How do you kill that which has no life (^)?

	// todo image and album info which I already fucking have somewhere else.
	// a lot of redundant methods in this API.

	// todo reporting, pls.

	// todo vote info (WHICH I CAN ALREADY GET FUCKING ELSEWHERE)

	// todo fuck it I'm doing this part some other time.
}
