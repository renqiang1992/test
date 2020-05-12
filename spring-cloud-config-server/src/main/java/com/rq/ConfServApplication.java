package com.rq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer//启用config配置中心
@EnableDiscoveryClient//启用服务注册与发现
@SpringBootApplication
public class ConfServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfServApplication.class, args);
		System.out.println("配置中心服务端启动成功!");

	}

}
