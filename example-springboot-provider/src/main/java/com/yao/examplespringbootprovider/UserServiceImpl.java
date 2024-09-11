package com.yao.examplespringbootprovider;

import com.yao.example.common.model.User;
import com.yao.example.common.service.UserService;
import com.yao.archerrpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
