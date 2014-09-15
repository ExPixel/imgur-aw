package com.github.expixel.imgur;

import com.github.expixel.imgur.models.response.ImgurError;
import com.github.expixel.imgur.models.adapters.ImgurTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

/**
 * @author ExPixel
 */
public class ImgurResponseConverter implements Converter {
	private Gson gson;
	private JsonParser parser;

	ImgurResponseConverter() {
		gson = new GsonBuilder()
				// .registerTypeAdapter(ImgurGalleryItem.class, new ImgurTypeAdapterFactory())
				.registerTypeAdapterFactory(new ImgurTypeAdapterFactory())
				.create();
		parser = new JsonParser();
	}

	@Override
	public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
		try {
			JsonObject o = (JsonObject) parser.parse(new InputStreamReader(typedInput.in()));
			if(o.has("success")) {
				if (Boolean.class.equals(type) || Boolean.TYPE.equals(type)) {
					return o.getAsJsonPrimitive("success").getAsBoolean();
				}
				if (o.has("data")) {
					if (o.getAsJsonPrimitive("success").getAsBoolean()) {
						Type __type = type;
						return gson.fromJson(o.get("data"), __type);
					}
				}
			}

			if (o.has("error")) {
				return gson.fromJson(o, ImgurError.class);
			} else {
				return gson.fromJson(o, type);
			}
		} catch (IOException e) {
			throw new ConversionException(e);
		}
	}

	@Override
	public TypedOutput toBody(Object o) {
		return new TypedString(gson.toJson(o));
	}
}
