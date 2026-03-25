package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.GroupDTO;
import com.cg.socialmedia.service.IGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    private final IGroupService service;

    public GroupController(IGroupService service) {
        this.service = service;
    }

    // GET ALL GROUPS
    @GetMapping
    public ResponseEntity<List<GroupDTO>> getAllGroups() {
        return ResponseEntity.ok(service.getAllGroups());
    }
}