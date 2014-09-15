package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurMessage {
	private long id;
	private String from;
	private long account_id;
	private long sender_id;
	private String body;
	private long conversation_id;
	private long datetime;

	public long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public long getAccountId() {
		return account_id;
	}

	public long getSenderId() {
		return sender_id;
	}

	public String getBody() {
		return body;
	}

	public long getConversationId() {
		return conversation_id;
	}

	public long getDatetime() {
		return datetime;
	}
}
