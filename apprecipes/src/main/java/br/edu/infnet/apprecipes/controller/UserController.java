package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;

@Controller
public class UserController {
	
	@GetMapping(value = "/user")
	public String userRegister() {
		return "user/register";
	}
	
	@PostMapping(value = "/user/add")
	public String addUser(AppRecipesUser user) {
		System.out.println("Inclusão realizada com sucesso!" + user);
		return "redirect:/";
	}

}