package com.cg.socialmedia.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    private int commentId;

    private int postId;
    private int userId;

    private String commentText;
    private LocalDateTime timestamp;

    // Constructors, Getters, Setters
    public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(int commentId, int postId, int userId, String commentText, LocalDateTime timestamp) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.userId = userId;
		this.commentText = commentText;
		this.timestamp = timestamp;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
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

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
	
}