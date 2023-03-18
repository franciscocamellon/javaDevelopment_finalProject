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
	
	public AppRecipesUser authenticate(AppRecipesUser user) {
		return userRepository.authentication(user.getEmail(), user.getPassword());
	}
	
	public AppRecipesUser addUser(AppRecipesUser user) {
		return userRepository.save(user);
	}
	
	public void removeUser(Integer key) {
		userRepository.deleteById(key);
	}
	
	public Collection<AppRecipesUser> getUserList() {
		return (Collection<AppRecipesUser>) userRepository.findAll();
	}
	
}
