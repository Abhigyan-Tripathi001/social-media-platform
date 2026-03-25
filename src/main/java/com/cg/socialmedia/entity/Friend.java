package com.cg.socialmedia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "friends")
public class Friend {

    @Id
    @Column(name = "friendshipID")
    private int friendshipId;

    @Column(name = "userID1")
    private int userId1;
    
    @Column(name = "userID2")
    private int userId2;

    private String status; // pending / accepted

    // Constructors, Getters, Setters
    public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(int friendshipId, int userId1, int userId2, String status) {
		super();
		this.friendshipId = friendshipId;
		this.userId1 = userId1;
		this.userId2 = userId2;
		this.status = status;
	}

	public int getFriendshipId() {
		return friendshipId;
	}

	public void setFriendshipId(int friendshipId) {
		this.friendshipId = friendshipId;
	}

	public int getUserId1() {
		return userId1;
	}

	public void setUserId1(int userId1) {
		this.userId1 = userId1;
	}

	public int getUserId2() {
		return userId2;
	}

	public void setUserId2(int userId2) {
		this.userId2 = userId2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}