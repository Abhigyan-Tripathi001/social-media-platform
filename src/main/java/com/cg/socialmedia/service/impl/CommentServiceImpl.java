package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.CommentDTO;
import com.cg.socialmedia.entity.Comment;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.CommentRepository;
import com.cg.socialmedia.service.ICommentService;

@Service
public class CommentServiceImpl implements ICommentService{
	
	private final CommentRepository repo;
	
	public CommentServiceImpl(CommentRepository repo) {
		this.repo=repo;
	}
	
//	@Override
//	public List<CommentDTO> getCommentsByPost(int postId) {
//	    return repo.findByPostId(postId)
//	            .stream()
//	            .map(EntityMapper::toCommentDTO)
//	            .toList();
//	}
	@Override
	public List<CommentDTO> getCommentsByPost(int postId) {

	    List<Comment> comments = repo.findByPostId(postId);

	    if (comments.isEmpty()) {
	        throw new RuntimeException("No comments found for post: " + postId);
	    }

	    return comments.stream()
	            .map(EntityMapper::toCommentDTO)
	            .toList();
	}

}
