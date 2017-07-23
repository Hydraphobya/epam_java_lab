package com.epam.second.exception;

public class SweetsFillingException extends Exception {

	private static final long serialVersionUID = 6917522444614242195L;

	public SweetsFillingException() {
	}

	public SweetsFillingException(String arg0) {
		super(arg0);
	}

	public SweetsFillingException(Throwable arg0) {
		super(arg0);
	}

	public SweetsFillingException(String message, Throwable cause) {
		super(message, cause);

	}

	public SweetsFillingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
