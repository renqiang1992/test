package com.rq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer//����config��������
@EnableDiscoveryClient//���÷���ע���뷢��
@SpringBootApplication
public class ConfServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfServApplication.class, args);
		System.out.println("ConfServApplication success!");

	}

}
