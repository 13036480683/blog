package com.xx.blog.service.impl;

import com.xx.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xx.blog.entity.User;
import com.xx.blog.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean getUser(String name, String psw) {
        if (null==name||"".equals(name)||null==psw||"".equals(psw)){
            return false;
        }
        if (null==userMapper.getUser(name,psw)){
            return false;
        }
        return true;
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void addUser(User user) {
        try {
            userMapper.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            userMapper.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteUser(String name, String psw) {
        try {
            userMapper.deleteUser(name,psw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
