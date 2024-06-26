package com.myapp.photoapp.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppUsersServiceApplication.class, args);
	}

}
