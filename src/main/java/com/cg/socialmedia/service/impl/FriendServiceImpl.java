package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.FriendDTO;
import com.cg.socialmedia.entity.Friend;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.FriendRepository;
import com.cg.socialmedia.service.IFriendService;

@Service
public class FriendServiceImpl implements IFriendService{
	
	private final FriendRepository repo;
	
	public FriendServiceImpl(FriendRepository repo) {
		this.repo=repo;
	}

//	@Override
//	public List<FriendDTO> getFriends(int userId) {
//	    return repo.findByUserId1(userId)
//	            .stream()
//	            .map(EntityMapper::toFriendDTO)
//	            .toList();
//	}
	@Override
	public List<FriendDTO> getFriends(int userId) {

	    List<Friend> friends = repo.findByUserId1(userId);

	    if (friends.isEmpty()) {
	        throw new RuntimeException("No friends found for user: " + userId);
	    }

	    return friends.stream()
	            .map(EntityMapper::toFriendDTO)
	            .toList();
	}
	
	

}
