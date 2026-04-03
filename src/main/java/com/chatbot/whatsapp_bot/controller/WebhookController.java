package com.chatbot.whatsapp_bot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.whatsapp_bot.model.MessageRequest;
import com.chatbot.whatsapp_bot.model.MessageResponse;
import com.chatbot.whatsapp_bot.service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

	private final ChatService chatservice;

	public WebhookController(ChatService chatservice) {
		this.chatservice = chatservice;
	}

	@PostMapping
	public MessageResponse receiveMessage(@RequestBody MessageRequest request) {
		return chatservice.processResponse(request);
	}
}
