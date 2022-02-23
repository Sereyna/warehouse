package com.sereyna.sbdemo.web;

import com.sereyna.sbdemo.entity.User;
import com.sereyna.sbdemo.service.UserService;
import com.sereyna.sbdemo.service.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/subscribe")
    @ResponseBody
    public boolean subscribe(@RequestBody User user){
        return userServiceImpl.login(user);
    }
}
