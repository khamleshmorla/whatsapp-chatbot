package com.chatbot.whatsapp_bot.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chatbot.whatsapp_bot.exception.InvalidMessageException;
import com.chatbot.whatsapp_bot.model.MessageRequest;
import com.chatbot.whatsapp_bot.model.MessageResponse;

import org.slf4j.Logger;

@Service
public class ChatService {

	private static final Logger logger = LoggerFactory.getLogger(ChatService.class);

	public MessageResponse processResponse(MessageRequest request) {

		if (request == null || request.getMessage() == null || request.getMessage().trim().isEmpty()) {
			throw new InvalidMessageException("Message cannot be empty");
		}

		String message = request.getMessage().trim().toLowerCase();
		String reply;

		switch (message) {
		case "hi":
			reply = "Hello";
			break;
		case "bye":
			reply = "GoodBye";
			break;
		case "how are you":
			reply = "I am fine, thank you!";
			break;
		case "thanks":
		    reply = "You're welcome!";
		    break;
		default:
			reply = "I don't understand";
		}

		logger.info("Incoming Message: {}", request.getMessage());
		logger.info("Time: {} | Message: {} | Reply: {}",
		        java.time.LocalDateTime.now(),
		        request.getMessage(),
		        reply);

		return new MessageResponse(reply);
	}
}
