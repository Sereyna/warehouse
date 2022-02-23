package com.sereyna.sbdemo.service;

import com.sereyna.sbdemo.entity.User;
import com.sereyna.sbdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public void add(String name, String pwd) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        userMapper.add(user);
    }

    @Override
    public void get(UserMapper mapper) {

    }

    @Override
    public void update(UserMapper mapper) {

    }

    @Override
    public boolean login(User user){
        //String name = user.getName();
        String pwd = user.getPwd();
        User u1 = userMapper.getByname(user);
        try {
            return u1.getPwd().equals(pwd);
        }catch (NullPointerException nullPointerException){
            return false;
        }
    }
}
