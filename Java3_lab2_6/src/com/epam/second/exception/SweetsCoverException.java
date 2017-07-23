package com.epam.second.exception;

public class SweetsCoverException extends Exception {
	private static final long serialVersionUID = 5565839764933398720L;
	public SweetsCoverException(){	
	}
	public SweetsCoverException(String message, Throwable exception){
		super(message, exception);
	}
	public SweetsCoverException(String message){
		super(message);
	}
	public SweetsCoverException(Throwable exception){
		super(exception);
	}
}
