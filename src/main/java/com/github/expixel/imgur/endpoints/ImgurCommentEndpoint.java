package com.github.expixel.imgur.endpoints;

import com.github.expixel.imgur.models.request.ImgurCommentPost;
import com.github.expixel.imgur.models.response.ImgurComment;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Implements API methods that can be found here: https://api.imgur.com/endpoints/comment
 * @author ExPixel
 */
public interface ImgurCommentEndpoint {
	@GET("/3/comment{id}")
	public ImgurComment getCommentInfo(@Path("id") String id);

	@POST("/3/comment")
	public boolean postComment(@Body ImgurCommentPost comment);

	@GET("/3/comment/{id}/replies")
	public ImgurComment[] getReplies(@Path("id") String commentId);

	@POST("/3/comment/{id}")
	public boolean replyToComment(@Path("id") String replyToId, @Body ImgurCommentPost comment);

	@POST("/3/comment{id}/vote/{vote}")
	public boolean voteOnComment(@Path("id") String commentId, @Path("vote") String vote);


	@POST("/3/comment/{id}/report")
	public boolean reportComment(@Path("id") String commentId);
}
