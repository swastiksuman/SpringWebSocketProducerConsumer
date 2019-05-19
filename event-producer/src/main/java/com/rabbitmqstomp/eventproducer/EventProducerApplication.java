package com.rabbitmqstomp.eventproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EventProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProducerApplication.class, args);
	}

}
