package com.example.financetracker.controller;

import com.example.financetracker.dto.LoginRequest;
import com.example.financetracker.dto.RegisterRequest;
import com.example.financetracker.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }

    // ✅ LOGIN ENDPOINT
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        boolean success = userService.login(
                request.getUsername(),
                request.getPassword()
        );

        if (success) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401)
                    .body("Invalid username or password");
        }
    }
}
