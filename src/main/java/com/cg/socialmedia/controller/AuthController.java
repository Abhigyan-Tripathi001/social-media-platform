package com.cg.socialmedia.controller;

import com.cg.socialmedia.dto.AuthRequest;
import com.cg.socialmedia.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {

        if ("admin".equals(request.getUsername()) &&
            "admin".equals(request.getPassword())) {

            return jwtUtil.generateToken(request.getUsername());
        } else {
            return "Invalid credentials";
        }
    }
}