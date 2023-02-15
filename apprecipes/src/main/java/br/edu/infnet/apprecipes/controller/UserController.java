package br.edu.infnet.apprecipes.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.repository.UserRepository;

@Controller
public class UserController {
	
	@GetMapping(value = "/user")
	public String userRegister() {
		return "user/register";
	}
	
	@GetMapping(value = "/user/list")
	public String userList() {
		
		List<AppRecipesUser> userList = UserRepository.getUserList();
		
		System.out.println("Quantidade de usuários: " + userList.size());
		
		for (AppRecipesUser user : userList) {
			System.out.printf("%s - %s\n", user.getName(), user.getEmail());
		}
		
		return "user/list";
	}
	
	@PostMapping(value = "/user/add")
	public String addUser(AppRecipesUser user) {
		System.out.println("Inclusão realizada com sucesso!" + user);
		
		UserRepository.addUser(user);
		
		return "redirect:/user/list";
	}

}