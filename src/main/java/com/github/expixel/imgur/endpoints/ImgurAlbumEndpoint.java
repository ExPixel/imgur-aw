package com.github.expixel.imgur.endpoints;

import com.github.expixel.imgur.models.request.ImgurAlbumUpdate;
import com.github.expixel.imgur.models.response.ImgurAlbum;
import com.github.expixel.imgur.models.response.ImgurImage;
import retrofit.http.*;

/**
 * Implements API methods that can be found here: https://api.imgur.com/endpoints/album
 * @author ExPixel
 */
public interface ImgurAlbumEndpoint {
	@GET("/3/album/{id}")
	public ImgurAlbum getAlbumInfo(@Path("id") String id);

	@GET("/3/album/{id}/images")
	public ImgurImage[] getImagesInAlbum(@Path("id") String id);

	@GET("/3/album/{album_id}/image/{image_id}")
	public ImgurImage[] getImageInfo(@Path("album_id") String albumId,
	                                 @Path("image_id") String imageId);

	@POST("/3/album")
	public boolean createAlbum(@Body ImgurAlbumUpdate album);

	@POST("/3/album/{deletehash}")
	public boolean updateAlbum(@Path("deletehash") String deleteHash, @Body ImgurAlbumUpdate album);


	@DELETE("/3/album/{deletehash}")
	public boolean deleteAlbum(@Path("deletehash") String deleteHash);

	@POST("/3/album/{id}/favorite")
	public boolean favoriteAlbum(@Path("id") String albumId);

	@POST("/3/album/{albumId}")
	public boolean setAlbumImages(@Path("id") String albumId,  @Query("ids") String[] imageId);


	@POST("/3/album/{albumId}/add")
	public boolean addAlbumImages(@Path("id") String albumId,  @Query("ids") String[] imageId);


	@DELETE("/3/album/{albumId}/remove_images")
	public boolean removeAlbumImages(@Path("id") String albumId,  @Query("ids") String[] imageId);
}
