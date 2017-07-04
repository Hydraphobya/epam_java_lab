package com.epam.first.exception;

public class PointException extends Exception {

	private static final long serialVersionUID = 1L;

	public PointException(){}
	
	public PointException(String message){
		super(message);
	}

}
