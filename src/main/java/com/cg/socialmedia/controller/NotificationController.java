package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.NotificationDTO;
import com.cg.socialmedia.service.INotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final INotificationService service;

    public NotificationController(INotificationService service) {
        this.service = service;
    }

    // GET NOTIFICATIONS
    @GetMapping("/{userId}")
    public ResponseEntity<List<NotificationDTO>> getNotifications(@PathVariable int userId) {
        return ResponseEntity.ok(service.getNotifications(userId));
    }
}