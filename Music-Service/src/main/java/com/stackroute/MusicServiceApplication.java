package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Main Class
@EnableEurekaClient
@SpringBootApplication
public class MusicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicServiceApplication.class, args);
	}

}
