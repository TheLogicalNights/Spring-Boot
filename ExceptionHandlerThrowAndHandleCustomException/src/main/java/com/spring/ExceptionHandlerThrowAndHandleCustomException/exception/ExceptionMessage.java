package com.spring.ExceptionHandlerThrowAndHandleCustomException.exception;

import java.util.Date;

public class ExceptionMessage {
	private Date timestamp;
	private String message;
	private int lineNumber;

	public ExceptionMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionMessage(Date timestamp, String message, int lineNumber) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.lineNumber = lineNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

}
