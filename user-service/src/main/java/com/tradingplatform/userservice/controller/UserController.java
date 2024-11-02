package com.tradingplatform.userservice.controller;

import com.tradingplatform.userservice.model.User;
import com.tradingplatform.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password) {
        return userService.loginUser(username, password);
    }

    @GetMapping("/profile/{id}")
    public User getUserProfile(@PathVariable Long id) {
        return userService.getUserProfile(id);
    }
}
