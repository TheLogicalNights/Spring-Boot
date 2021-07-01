package com.spring.ExceptionHandlerDisplayCustomMessage.model;

import java.util.Date;

public class ExceptionMessageModel {
	private Date timestamp;
	private String message;

	public ExceptionMessageModel(Date timestamp, String message) {
		super();
		this.timestamp = timestamp;
		this.message = message;
	}

}
