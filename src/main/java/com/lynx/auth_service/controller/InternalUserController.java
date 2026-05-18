package com.lynx.auth_service.controller;

import com.lynx.auth_service.entity.User;
import com.lynx.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/internal/users")
@RequiredArgsConstructor
public class InternalUserController {

    private final AuthService authService;

    @GetMapping
    public List<User> getAllUsers() {
        return authService.getAllUsers();
    }

    @GetMapping("/count")
    public long getUserCount() {
        return authService.getUserCount();
    }
}
