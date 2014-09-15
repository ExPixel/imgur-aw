package com.github.expixel.imgur.models.response;

/**
 * @author ExPixel
 */
public class ImgurConversation {
	private long id;
	private String last_message_preview;
	private long datetime;
	private long with_account_id;
	private String with_account;
	private int message_count;
	private ImgurMessage[] messages;
	private boolean done;
	private int page;

	public long getId() {
		return id;
	}

	public String getLastMessagePreview() {
		return last_message_preview;
	}

	public long getDatetime() {
		return datetime;
	}

	public long getWithAccountId() {
		return with_account_id;
	}

	public String getWithAccount() {
		return with_account;
	}

	public int getMessageCount() {
		return message_count;
	}

	public ImgurMessage[] getMessages() {
		return messages;
	}

	public boolean isDone() {
		return done;
	}

	public int getPage() {
		return page;
	}
}
