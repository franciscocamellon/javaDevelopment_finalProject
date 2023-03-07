package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean addUser(AppRecipesUser user) {
		return userRepository.addUser(user);
	}
	
	public AppRecipesUser removeUser(Integer key) {
		return userRepository.removeUser(key);
	}
	
	public Collection<AppRecipesUser> getUserList() {
		return userRepository.getUserList();
	}
	
}
