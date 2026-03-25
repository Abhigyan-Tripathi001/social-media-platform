package com.cg.socialmedia.dto;

import java.time.LocalDateTime;

public class PostDTO {

    private int postId;
    private int userId;
    private String content;
    private LocalDateTime timestamp;

    // Constructors, Getters, Setters
    public PostDTO() {
		// TODO Auto-generated constructor stub
	}

	public PostDTO(int postId, int userId, String content, LocalDateTime timestamp) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.content = content;
		this.timestamp = timestamp;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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