package com.rabbitmqstomp.eventconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EventConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventConsumerApplication.class, args);
	}

}
