package org.example.lang.service;


import org.example.lang.bean.User;
import org.example.lang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
