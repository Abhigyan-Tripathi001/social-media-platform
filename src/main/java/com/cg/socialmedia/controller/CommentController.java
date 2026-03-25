package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.CommentDTO;
import com.cg.socialmedia.service.ICommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final ICommentService service;

    public CommentController(ICommentService service) {
        this.service = service;
    }

    // GET COMMENTS BY POST
    @GetMapping("/post/{postId}")
    public ResponseEntity<List<CommentDTO>> getComments(@PathVariable int postId) {
        return ResponseEntity.ok(service.getCommentsByPost(postId));
    }
}