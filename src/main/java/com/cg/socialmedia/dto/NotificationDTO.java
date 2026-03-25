package com.cg.socialmedia.dto;

import java.time.LocalDateTime;

public class NotificationDTO {

    private int notificationId;
    private int userId;
    private String content;
    private LocalDateTime timestamp;

    // Constructors, Getters, Setters
    public NotificationDTO() {
		// TODO Auto-generated constructor stub
	}

	public NotificationDTO(int notificationId, int userId, String content, LocalDateTime timestamp) {
		super();
		this.notificationId = notificationId;
		this.userId = userId;
		this.content = content;
		this.timestamp = timestamp;
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
}