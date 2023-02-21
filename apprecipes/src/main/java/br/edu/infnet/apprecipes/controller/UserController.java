package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.repository.UserRepository;

@Controller
public class UserController {
	
	private String msg;
	
	@GetMapping(value = "/user")
	public String userRegister() {
		return "user/register";
	}
	
	@GetMapping(value = "/user/list")
	public String userList(Model model) {
		
		model.addAttribute("users", UserRepository.getUserList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "user/list";
	}
	
	@PostMapping(value = "/user/add")
	public String addUser(AppRecipesUser user) {
		System.out.println("Inclusão realizada com sucesso!" + user);
		
		UserRepository.addUser(user);
		
		msg = "A inclusão do usuário "+user.getName()+" foi realizada com sucesso!";
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String removeUser(@PathVariable Integer id) {
		
		AppRecipesUser user = UserRepository.removeUser(id);
		
		msg = "A exclusão do usuário "+user.getName()+" foi realizada com sucesso!";
		
		return "redirect:/user/list";
	}

}