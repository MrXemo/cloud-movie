package com.tongudn.microservicsimpleprovideruser.controller;

import com.tongudn.microservicsimpleprovideruser.dao.UserMapper;
import com.tongudn.microservicsimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne = userMapper.findById(id);
        return findOne;
    }
}
