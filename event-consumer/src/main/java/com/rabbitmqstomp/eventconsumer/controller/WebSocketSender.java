package com.rabbitmqstomp.eventconsumer.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@CrossOrigin
public class WebSocketSender {
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/javainuse")
	public String sendMessage(@Payload String webSocketChatMessage) {
		return webSocketChatMessage;
	}

	@MessageMapping("/chat.newUser")
	@SendTo("/topic/javainuse")
	public String newUser(@Payload String webSocketChatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", webSocketChatMessage);
		return webSocketChatMessage;
	}
}
