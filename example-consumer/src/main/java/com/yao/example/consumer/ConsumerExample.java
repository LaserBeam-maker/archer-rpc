package com.yao.example.consumer;

import com.yao.example.common.model.User;
import com.yao.example.common.service.UserService;
import com.yao.archerrpc.bootstrap.ConsumerBootstrap;
import com.yao.archerrpc.proxy.ServiceProxyFactory;

public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
