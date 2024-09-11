package com.yao.example.provider;

import com.yao.example.common.service.UserService;
import com.yao.archerrpc.registry.LocalRegistry;
import com.yao.archerrpc.server.HttpServer;
import com.yao.archerrpc.server.VertxHttpServer;

public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
