package br.edu.infnet.apprecipes.model.exceptions;

public class NullOrEmptyAttributeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NullOrEmptyAttributeException(String message) {
		super(message);
	}

}
