package com.cg.socialmedia.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class Like {

    @Id
    private int likeId;

    private int postId;
    private int userId;

    private LocalDateTime timestamp;

    // Constructors, Getters, Setters
    public Like() {
		// TODO Auto-generated constructor stub
	}

	public Like(int likeId, int postId, int userId, LocalDateTime timestamp) {
		super();
		this.likeId = likeId;
		this.postId = postId;
		this.userId = userId;
		this.timestamp = timestamp;
	}

	public int getLikeId() {
		return likeId;
	}

	public void setLikeId(int likeId) {
		this.likeId = likeId;
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

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
}