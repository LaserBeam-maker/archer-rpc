# Archer RPC 框架

---

## 项目介绍

基于 Java + Etcd + Vert.x 的高性能 RPC 框架，用新颖的技术栈从 0 到 1 造轮子。项目中用到的技术包括：基于 Vert.x 的网络服务器、序列化器、基于 Etcd 和 ZooKeeper 的注册中心、反射、动态代理、自定义网络协议、多种设计模式（单例 / 工厂 / 装饰者等）、负载均衡器设计、重试和容错机制、Spring Boot Starter 注解驱动开发等。

## 技术选型

### 后端

后端技术以 Java 为主，但所有的思想和设计都是可以复用到其他语言的，代码不同罢了。

- ⭐️ Vert.x 框架
- ⭐️ Etcd 云原生存储中间件（jetcd 客户端）
- ZooKeeper 分布式协调工具（curator 客户端）
- ⭐️ SPI 机制
- ⭐️ 多种序列化器
  - JSON 序列化
  - Kryo 序列化
  - Hessian 序列化
- ⭐️ 多种设计模式
  - 双检锁单例模式
  - 工厂模式
  - 代理模式
  - 装饰者模式
- ⭐️ Spring Boot Starter 开发
- 反射和注解驱动
- Guava Retrying 重试库
- JUnit 单元测试
- Logback 日志库
- Hutool、Lombok 工具库



## 源码目录

- archer-rpc-core：Archer RPC 框架核心代码
- archer-rpc-easy：Archer RPC 框架简易版
- example-common：示例代码公用模块
- example-consumer：示例服务消费者
- example-provider：示例服务提供者
- example-springboot-consumer：示例服务消费者（Spring Boot 框架）
- example-springboot-provider：示例服务提供者（Spring Boot 框架）
- archer-rpc-spring-boot-starter：注解驱动的 RPC 框架，可以在 Spring Boot 项目中快速使用
