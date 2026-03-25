package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.LikeDTO;
import com.cg.socialmedia.entity.Like;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.LikeRepository;
import com.cg.socialmedia.service.ILikeService;

@Service
public class LikeServiceImpl implements ILikeService{
	
	private final LikeRepository repo;
	
	public LikeServiceImpl(LikeRepository repo) {
		this.repo=repo;
	}
	
//	@Override
//	public List<LikeDTO> getLikesByPost(int postId) {
//	    return repo.findByPostId(postId)
//	            .stream()
//	            .map(EntityMapper::toLikeDTO)
//	            .toList();
//	}
	@Override
	public List<LikeDTO> getLikesByPost(int postId) {

	    List<Like> likes = repo.findByPostId(postId);

	    if (likes.isEmpty()) {
	        throw new RuntimeException("No likes found for post: " + postId);
	    }

	    return likes.stream()
	            .map(EntityMapper::toLikeDTO)
	            .toList();
	}

}
