package com.yyy.shop.service;

import com.yyy.shop.model.User;


public interface UserService {
    User getUserByUserName(String username);
    User findUserById(Long id);
    User saveUser(User user);

}
