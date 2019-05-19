package com.rabbitmqstomp.eventconsumer.controller;

import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@GetMapping("/")
	public String getIndex() {
		QueueBuilder.durable("MyQueue").build();
		this.rabbitTemplate.convertAndSend("MyQueue", "SSSSSSSS");
		return "index.html";
	}
}
