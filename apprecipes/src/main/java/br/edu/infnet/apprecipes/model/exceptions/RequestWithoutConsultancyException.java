package br.edu.infnet.apprecipes.model.exceptions;

public class RequestWithoutConsultancyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RequestWithoutConsultancyException(String message) {
		super(message);
	}

}
