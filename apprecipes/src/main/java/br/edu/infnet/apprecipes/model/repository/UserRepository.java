package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;

@Repository
public class UserRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, AppRecipesUser> mapUserList = new HashMap<Integer, AppRecipesUser>();
	
	public boolean addUser(AppRecipesUser user) {
		
		user.setId(id++);
		
		try {
			mapUserList.put(user.getId(), user);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public AppRecipesUser removeUser(Integer userId) {
		
		return mapUserList.remove(userId);
		
	}
	
	public Collection<AppRecipesUser> getUserList() {
		return mapUserList.values();
	}

}
