package com.sereyna.sbdemo.service;

import com.sereyna.sbdemo.entity.User;
import com.sereyna.sbdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void add(String name, String pwd);

    void get(UserMapper mapper);

    void update(UserMapper mapper);

    default boolean login(User user) {
        return false;
    }
}
