package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.LikeDTO;
import com.cg.socialmedia.service.ILikeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    private final ILikeService service;

    public LikeController(ILikeService service) {
        this.service = service;
    }

    // GET LIKES BY POST
    @GetMapping("/post/{postId}")
    public ResponseEntity<List<LikeDTO>> getLikes(@PathVariable int postId) {
        return ResponseEntity.ok(service.getLikesByPost(postId));
    }
}