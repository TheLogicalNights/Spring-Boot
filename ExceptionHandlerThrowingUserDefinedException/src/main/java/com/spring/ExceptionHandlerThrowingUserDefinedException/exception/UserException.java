package com.spring.ExceptionHandlerThrowingUserDefinedException.exception;

public class UserException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserException(String message)
	{
		super(message);
	}

}
