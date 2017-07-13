package com.epam.second.exceptions;

public class SweetsCostException extends Exception {
	private static final long serialVersionUID = 1L;
	public SweetsCostException(){	
	}
	public SweetsCostException(String message, Throwable exception){
		super(message, exception);
	}
	public SweetsCostException(String message){
		super(message);
	}
	public SweetsCostException(Throwable exception){
		super(exception);
	}
}