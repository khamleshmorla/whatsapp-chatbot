package com.chatbot.whatsapp_bot.exception;

@SuppressWarnings("serial")
public class InvalidMessageException extends RuntimeException {

	public InvalidMessageException(String message) {
		super(message);
	}

}
