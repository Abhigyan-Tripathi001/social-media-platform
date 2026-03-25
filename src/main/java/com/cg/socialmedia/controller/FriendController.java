package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.FriendDTO;
import com.cg.socialmedia.service.IFriendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class FriendController {

    private final IFriendService service;

    public FriendController(IFriendService service) {
        this.service = service;
    }

    // GET FRIENDS
    @GetMapping("/{userId}")
    public ResponseEntity<List<FriendDTO>> getFriends(@PathVariable int userId) {
        return ResponseEntity.ok(service.getFriends(userId));
    }
}