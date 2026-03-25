package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.MessageDTO;
import com.cg.socialmedia.service.IMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final IMessageService service;

    public MessageController(IMessageService service) {
        this.service = service;
    }

    // GET MESSAGES BY SENDER
    @GetMapping("/sender/{senderId}")
    public ResponseEntity<List<MessageDTO>> getMessages(@PathVariable int senderId) {
        return ResponseEntity.ok(service.getMessagesBySender(senderId));
    }
}