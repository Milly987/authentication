package com.code.authentication.services;

import com.code.authentication.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
