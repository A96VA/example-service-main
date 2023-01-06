package com.marketplace.initexampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InitExampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitExampleServiceApplication.class, args);
	}

}
