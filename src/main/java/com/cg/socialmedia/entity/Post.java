package com.cg.socialmedia.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column(name = "postID")
    private int postId;

    @Column(name = "userID")
    private int userId;
    private String content;

    private LocalDateTime timestamp;
    
    public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(int postId, int userId, String content, LocalDateTime timestamp) {
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

    // Constructors, Getters, Setters
    
	
}