package com.cg.socialmedia.controller;

import com.cg.socialmedia.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    private final IUserService userService;
    private final IPostService postService;
    private final ICommentService commentService;
    private final ILikeService likeService;
    private final IFriendService friendService;
    private final IMessageService messageService;
    private final INotificationService notificationService;
    private final IGroupService groupService;

    public ViewController(IUserService userService,
                          IPostService postService,
                          ICommentService commentService,
                          ILikeService likeService,
                          IFriendService friendService,
                          IMessageService messageService,
                          INotificationService notificationService,
                          IGroupService groupService) {
        this.userService = userService;
        this.postService = postService;
        this.commentService = commentService;
        this.likeService = likeService;
        this.friendService = friendService;
        this.messageService = messageService;
        this.notificationService = notificationService;
        this.groupService = groupService;
    }

    // 1️⃣ HOME
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // 2️⃣ USERS
    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    // 3️⃣ POSTS
    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    // 4️⃣ COMMENTS + LIKES
    @GetMapping("/comments/{postId}")
    public String comments(@PathVariable int postId, Model model) {
        model.addAttribute("comments", commentService.getCommentsByPost(postId));
        model.addAttribute("likes", likeService.getLikesByPost(postId));
        return "comments";
    }

    // 5️⃣ FRIENDS + MESSAGES
    @GetMapping("/friends/{userId}")
    public String friends(@PathVariable int userId, Model model) {
        model.addAttribute("friends", friendService.getFriends(userId));
        model.addAttribute("messages", messageService.getMessagesBySender(userId));
        return "friends";
    }

    // 6️⃣ NOTIFICATIONS + GROUPS
    @GetMapping("/notifications/{userId}")
    public String notifications(@PathVariable int userId, Model model) {
        model.addAttribute("notifications", notificationService.getNotifications(userId));
        model.addAttribute("groups", groupService.getAllGroups());
        return "notifications";
    }
}