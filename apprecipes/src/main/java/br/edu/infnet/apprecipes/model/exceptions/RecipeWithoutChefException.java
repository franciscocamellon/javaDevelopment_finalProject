package br.edu.infnet.apprecipes.model.exceptions;

public class RecipeWithoutChefException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RecipeWithoutChefException(String message) {
		super(message);
	}

}
