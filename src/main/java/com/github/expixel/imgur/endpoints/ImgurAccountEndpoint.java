package com.github.expixel.imgur.endpoints;

import com.github.expixel.imgur.models.request.ImgurAccountSettingsChange;
import com.github.expixel.imgur.models.response.*;
import com.github.expixel.imgur.models.special.ImgurGalleryItem;
import retrofit.http.*;

import javax.management.Notification;

/**
 * Implements API methods that can be found here: https://api.imgur.com/endpoints/account
 * @author ExPixel
 */
public interface ImgurAccountEndpoint {
	/**
	 * Gets information about a user.
	 * @param username The user to retrieve information about.
	 * @return The user's account information.
	 */
	@GET("/3/account/{username}")
	public ImgurAccount getUserInformation(@Path("username") String username);

	/**
	 * Retrieves information about the current user.
	 * @see com.github.expixel.imgur.endpoints.ImgurAccountEndpoint#getUserInformation(String)
	 * @return The current user's account information.
	 */
	@GET("/3/account/me")
	public ImgurAccount getUserInformation();

	@GET("/3/account/{username}/gallery_favorites")
	public ImgurGalleryItem[] getGalleryFavorites(@Path("username") String username, @Query("page") int page);

	@GET("/3/account/{username}/submissions/{page}")
	public ImgurGalleryItem[] getGallerySubmissions(@Path("username") String username, @Path("page") int page);

	@GET("/3/account/{username}/settings")
	public ImgurAccountSettings getAccountSettings( @Path("username") String username );

	@POST("/3/account/{username}/settings")
	public boolean setAccountSettings(@Path("username") String username,
	                                  @Body ImgurAccountSettingsChange change);

	@GET("/3/account/{username}/gallery_profile")
	public ImgurGalleryProfile getGalleryProfile(@Path("username") String username);

	// todo MISSING http://api.imgur.com/endpoints/account#verify-email

	@GET("/3/account/{username}/albums/{page}")
	public ImgurAlbum[] getAlbums(@Path("username") String username, @Path("page") int page);

	@GET("/3/account/{username}/album/{id}")
	public ImgurAlbum[] getAlbumInfo(@Path("username") String username, @Path("id") String id);

	@GET("/3/account/{username}/albums/ids/{page}")
	public String[] getAlbumIds(@Path("username") String username, @Path("page") int page);

	@GET("/3/account/{username}/albums/count")
	public int getAlbumCount(@Path("username") String username);

	@DELETE("/3/account/{username}/album/{id}")
	public boolean deleteAlbum(@Path("username") String username, @Path("id") String id);

	/**
	 * Sorts: 'best', 'worst', 'oldest', or 'newest'.
	 */
	@GET("/3/account/{username}/comments/{sort}/{page}")
	public ImgurComment[] getComments(@Path("username") String username, @Path("sort") String sort,
	                                  @Path("page") int page);

	@GET("/3/account/{username}/comment/{id}")
	public ImgurComment getCommentInfo(@Path("username") String username, @Path("id") String id);

	@GET("/3/account/{username}/comments/ids/{sort}/{page}")
	public String[] getCOmmentIds(@Path("username") String username, @Path("sort") String sort,
	                              @Path("page") int page);

	@GET("/3/account/{username}/comments/count")
	public int getCommentCount(@Path("username") String username);

	@DELETE("/3/account/{username}/comment/{id}")
	public boolean deleteComment(@Path("username") String username, @Path("id") String id);

	@GET("/3/account/{username}/images/{page}")
	public ImgurImage[] getImages(@Path("username") String username, @Path("page") int page);

	@GET("/3/account/{username}/image/{id}")
	public ImgurImage[] getImageInfo(@Path("username") String username, @Path("id") String id);

	@GET("/3/account/{username}/images/ids/{page}")
	public String[] getImageIds(@Path("username") String username, @Path("page") int page);

	@GET("/3/account/{username}/images/count")
	public int getImageCount(@Path("username") String username);

	@DELETE("/3/account/{username}/image/{id}")
	public boolean deleteImage(@Path("username") String username, @Path("id") String id);

	@GET("/3/account/{username}/notifications/replies")
	public Notification[] getReplies(@Path("username") String username, @Query("new") boolean newReplies);
}
