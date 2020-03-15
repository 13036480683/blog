package com.xx.blog.service;

import com.xx.blog.entity.User;

import java.util.List;

public interface UserService {
    Boolean getUser(String name, String psw);
    List<User> getAllUser();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(String name, String psw);

}
