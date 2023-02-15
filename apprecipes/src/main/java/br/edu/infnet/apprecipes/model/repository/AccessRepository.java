package br.edu.infnet.apprecipes.model.repository;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;

public class AccessRepository {
	
	public static AppRecipesUser authentication(AppRecipesUser user) {
		
		if (user.getEmail().equalsIgnoreCase(user.getPassword())) {
			return new AppRecipesUser("Administrador", user.getEmail(), user.getPassword());
		}
		
		return null;
	}

}
