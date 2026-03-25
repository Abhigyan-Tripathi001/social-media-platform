package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.PostDTO;
import com.cg.socialmedia.service.IPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final IPostService service;

    public PostController(IPostService service) {
        this.service = service;
    }

    // GET ALL POSTS
    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        return ResponseEntity.ok(service.getAllPosts());
    }

    // GET POSTS BY USER
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<PostDTO>> getPostsByUser(@PathVariable int userId) {
        return ResponseEntity.ok(service.getPostsByUser(userId));
    }
}