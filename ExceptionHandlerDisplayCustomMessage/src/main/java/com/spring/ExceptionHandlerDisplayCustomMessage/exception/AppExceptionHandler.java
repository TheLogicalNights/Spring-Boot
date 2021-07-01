package com.spring.ExceptionHandlerDisplayCustomMessage.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.spring.ExceptionHandlerDisplayCustomMessage.model.ExceptionMessageModel;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest request)
	{
		String msg = ex.getLocalizedMessage();
		if(msg==null) 
		{	
			msg = ex.toString();
		}
		ExceptionMessageModel errorMsg = new ExceptionMessageModel(new Date(), msg);
		return new ResponseEntity<>(errorMsg,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
