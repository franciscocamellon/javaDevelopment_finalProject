package br.edu.infnet.apprecipes.model.exceptions;

public class RequestWithoutClientException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RequestWithoutClientException(String message) {
		super(message);
	}

}
