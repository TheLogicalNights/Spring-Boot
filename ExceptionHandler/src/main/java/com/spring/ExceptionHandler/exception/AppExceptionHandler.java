package com.spring.ExceptionHandler.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest request)
	{
			return new ResponseEntity<Object>(ex,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
