package com.java.antu.swagger.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;
	
	
}
