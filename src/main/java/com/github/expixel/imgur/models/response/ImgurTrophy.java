package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurTrophy {
	private int id;
	private String name;
	private String name_clean;
	private String description;
	private String data;
	private String data_link;
	private long datetime;
	private String image;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/**
	 *
	 * @return ID of a trophy type.
	 */
	public String getCleanName() {
		return name_clean;
	}

	public String getDescription() {
		return description;
	}

	public String getData() {
		return data;
	}

	public String getDataLink() {
		return data_link;
	}

	public long getDatetime() {
		return datetime;
	}

	public String getImage() {
		return image;
	}
}
