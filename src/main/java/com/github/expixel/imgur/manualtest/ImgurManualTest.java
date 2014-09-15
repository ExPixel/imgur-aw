package com.github.expixel.imgur.manualtest;

import com.github.expixel.imgur.Imgur;
import com.github.expixel.imgur.models.response.ImgurAuthData;
import com.github.expixel.imgur.models.special.ImgurGalleryItem;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.prefs.Preferences;

/**
 * todo remove this.
 * @author ExPixel
 */
public class ImgurManualTest {
	private static final Preferences prefs = Preferences.userRoot().node("expixel").node("imgurtest");

	public static void main(String[] args) throws IOException {
		// CHANGE THIS:
		// src\main\resources\com\github\expixel\imgur\manualtest\apistuff.properties

		Properties properties = new Properties();
		properties.load( ImgurManualTest.class.getResourceAsStream("apistuff.properties") );
		Imgur imgur = new Imgur(
				properties.getProperty("api.key"),
				properties.getProperty("api.secret"),
				"Imgur Java API Wrapper/1.0");
		String authStr = prefs.get("auth", null);
		Gson gson = new Gson();

		if(authStr == null) {
			System.out.println(">> auth URL: " + imgur.getPinAuthorizationURL());
			Scanner scanner = new Scanner(System.in);
			System.out.print(">> pin: ");
			String pin = scanner.nextLine();
			System.out.println("Authorizing...");
			imgur.authorizeWithPin(pin);
			System.out.println("Output: ");
			System.out.println(String.valueOf(imgur.getAuthData()));
			prefs.put("auth", gson.toJson(imgur.getAuthData()));
		} else {
			System.out.println("Already authorized.");
			imgur.setAuthData( gson.fromJson(authStr, ImgurAuthData.class) );
		}


		// temporarily in case the code below fails.
		prefs.remove("auth");

		System.out.println("Getting gallery favourites:");
		ImgurGalleryItem[] items = imgur.account().getGalleryFavorites( imgur.getAuthData().getAccountUsername(), 2 );
		System.out.println("Finished");
		for(ImgurGalleryItem item : items) {
			if(item.isAlbum()) System.out.println("Album: " + item.asAlbum().getTitle() + " : http://imgur.com/" + item.asAlbum().getId());
			else System.out.println("Image: " + item.asImage().getTitle() + " : http://imgur.com/" + item.asImage().getId());
		}

		prefs.put("auth", gson.toJson(imgur.getAuthData()));
	}
}
