package com.github.expixel.imgur.models.adapters;

import com.github.expixel.imgur.models.response.ImgurGalleryAlbum;
import com.github.expixel.imgur.models.response.ImgurGalleryImage;
import com.github.expixel.imgur.models.special.ImgurGalleryItem;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * @author ExPixel
 */
public class ImgurTypeAdapterFactory implements TypeAdapterFactory {
	@Override
	public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
		final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
		return new TypeAdapter<T>() {
			@Override
			public void write(JsonWriter jsonWriter, T t) throws IOException {
				final TypeAdapter<T> delegate = gson.getDelegateAdapter(ImgurTypeAdapterFactory.this, typeToken);
				delegate.write(jsonWriter, t);
			}

			@Override
			public T read(JsonReader jsonReader) throws IOException {
				JsonElement element = elementAdapter.read(jsonReader);
				Class<? extends T> clazz = null;
				Class<?> nclazz = getRealClass(typeToken.getRawType(), element);
				if(nclazz != null) {
					//noinspection unchecked
					clazz = ((Class<? extends T>) nclazz);
				}
				final TypeAdapter<? extends T> delegate;
				if(clazz == null) {
					delegate = gson.getDelegateAdapter(ImgurTypeAdapterFactory.this, typeToken);
				} else {
					delegate = gson.getDelegateAdapter(ImgurTypeAdapterFactory.this, TypeToken.get(clazz));
				}
				return delegate.fromJsonTree(element);
			}
		};
	}

	private <T> Class<?> getRealClass(Class<? super T> declaredClass, JsonElement element) {
		if(declaredClass.isAssignableFrom(ImgurGalleryItem.class)) {
			if(element.isJsonObject()) {
				JsonObject o = element.getAsJsonObject();
				if(o.has("is_album") && o.getAsJsonPrimitive("is_album").getAsBoolean()) {
					return ImgurGalleryAlbum.class;
				} else {
					return ImgurGalleryImage.class;
				}
				/*
				if(element.getAsJsonObject().has("images")) {
					return ImgurGalleryAlbum.class;
				} else {
					return ImgurGalleryImage.class;
				}
				*/
			}
		}
		return null;
	}
}
