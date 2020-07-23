package com.upeu.edu.pe.sismocaed.exception;

public class FileStorageException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3458052249509259667L;

	
	public FileStorageException(String message) {
		super(message);
	}
	
	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
	}
}
