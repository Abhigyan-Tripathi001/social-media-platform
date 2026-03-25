package com.cg.socialmedia.dto;

public class GroupDTO {

    private int groupId;
    private String groupName;
    private int adminId;

    // Constructors, Getters, Setters
    public GroupDTO() {
		// TODO Auto-generated constructor stub
	}

	public GroupDTO(int groupId, String groupName, int adminId) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.adminId = adminId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
    
}