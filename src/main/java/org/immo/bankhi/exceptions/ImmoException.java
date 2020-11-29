package org.immo.bankhi.exceptions;

import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
public class ImmoException extends Exception {
	
	public ImmoException(String message){
		super(message);
	}
	
	public ImmoException(String message, Throwable err){
		super(message, err);
	}

}
