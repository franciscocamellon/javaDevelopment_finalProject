package br.edu.infnet.apprecipes.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;

public class UserRepository {
	
	private static List<AppRecipesUser> userList = new ArrayList<AppRecipesUser>();
	
	public static boolean addUser(AppRecipesUser user) {
		
		try {
			userList.add(user);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public static List<AppRecipesUser> getUserList() {
		return userList;
	}

}
