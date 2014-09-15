package com.github.expixel.imgur.endpoints;

import com.github.expixel.imgur.models.response.ImgurAuthData;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * @author ExPixel
 */
public interface ImgurAuthEndpoint {
	@POST("/oauth2/token")
	public ImgurAuthData refresh(@Query("client_id") String clientId,
	                             @Query("client_secret") String clientSecret,
	                             @Query("grant_type") String grantType,
	                             @Query("refresh_token") String refresh_token);

//	@POST("/oauth2/token")
//	public ImgurAuthData exchangePin(@Query("client_id") String clientId,
//	                                 @Query("client_secret") String clientSecret,
//	                                 @Query("grant_type") String grantType,
//	                                 @Query("pin") String pin);

	@FormUrlEncoded
	@POST("/oauth2/token")
	public ImgurAuthData exchangePin(@Field("client_id") String clientId,
	                                 @Field("client_secret") String clientSecret,
	                                 @Field("grant_type") String grantType,
	                                 @Field("pin") String pin);

	@POST("/oauth2/token")
	@Deprecated
	public ImgurAuthData exchangeCode(@Query("client_id") String clientId,
	                                  @Query("client_secret") String clientSecret,
	                                  @Query("grant_type") String grantType,
	                                  @Query("authorization_code") String code);
}
