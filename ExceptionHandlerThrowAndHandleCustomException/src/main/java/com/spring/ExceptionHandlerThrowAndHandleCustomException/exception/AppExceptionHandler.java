package com.spring.ExceptionHandlerThrowAndHandleCustomException.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(value = {UserException.class})
	public ResponseEntity<Object> handleUserDefinedException(UserException ex,WebRequest request)
	{
		String msg = ex.getLocalizedMessage();
		if(msg==null) msg = ex.toString();
		int lineNumber = ex.getStackTrace()[0].getLineNumber();
		ExceptionMessage errorMsg = new ExceptionMessage(new Date(),msg,lineNumber);
		return new ResponseEntity<>(errorMsg,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
