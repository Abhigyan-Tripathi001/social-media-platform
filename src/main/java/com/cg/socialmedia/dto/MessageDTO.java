package com.cg.socialmedia.dto;

import java.time.LocalDateTime;

public class MessageDTO {

    private int messageId;
    private int senderId;
    private int receiverId;
    private String messageText;
    private LocalDateTime timestamp;

    // Constructors, Getters, Setters
    public MessageDTO() {
		// TODO Auto-generated constructor stub
	}

	public MessageDTO(int messageId, int senderId, int receiverId, String messageText, LocalDateTime timestamp) {
		super();
		this.messageId = messageId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messageText = messageText;
		this.timestamp = timestamp;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
}