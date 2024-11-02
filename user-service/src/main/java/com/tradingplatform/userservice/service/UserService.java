package com.tradingplatform.userservice.service;

import com.tradingplatform.userservice.model.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String username, String password);
    User getUserProfile(Long userId);
}