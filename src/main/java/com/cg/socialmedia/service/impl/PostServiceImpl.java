package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.cg.socialmedia.dto.PostDTO;
import com.cg.socialmedia.entity.Post;
import com.cg.socialmedia.exception.PostNotFoundException;
//import com.cg.socialmedia.entity.Post;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.PostRepository;
import com.cg.socialmedia.service.IPostService;

@Service
public class PostServiceImpl implements IPostService{
	
//	@Autowired
	private final PostRepository repo;
	
	public PostServiceImpl(PostRepository repo) {
		this.repo=repo;
	}
	

	@Override
	public List<PostDTO> getAllPosts() {
	    return repo.findAll()
	            .stream()
	            .map(EntityMapper::toPostDTO)
	            .toList();
	}

//	@Override
//	public List<PostDTO> getPostsByUser(int userId) {
//	    return repo.findByUserId(userId)
//	            .stream()
//	            .map(EntityMapper::toPostDTO)
//	            .toList();
//	}
	@Override
	public List<PostDTO> getPostsByUser(int userId) {

	    List<Post> posts = repo.findByUserId(userId);

	    if (posts.isEmpty()) {
	        throw new PostNotFoundException("No posts found for user: " + userId);
	    }

	    return posts.stream()
	            .map(EntityMapper::toPostDTO)
	            .toList();
	}

}
