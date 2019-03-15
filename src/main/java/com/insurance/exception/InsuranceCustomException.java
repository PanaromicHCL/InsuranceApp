package com.insurance.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @NoArgsConstructor @ToString
public class InsuranceCustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	private HttpStatus status;

	public InsuranceCustomException(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
	

}
