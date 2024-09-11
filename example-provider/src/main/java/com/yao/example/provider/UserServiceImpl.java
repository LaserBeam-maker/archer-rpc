package com.yao.example.provider;

import com.yao.example.common.model.User;
import com.yao.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
