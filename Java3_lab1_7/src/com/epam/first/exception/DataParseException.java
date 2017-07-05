package com.epam.first.exception;

public class DataParseException extends Exception {
	private static final long serialVersionUID = 1L;
	public DataParseException(){	
	}
	public DataParseException(String message, Throwable exception){
		super(message, exception);
	}
	public DataParseException(String message){
		super(message);
	}
	public DataParseException(Throwable exception){
		super(exception);
	}

}
