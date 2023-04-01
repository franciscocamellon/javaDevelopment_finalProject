package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.Address;
import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private String msg;
	
	@GetMapping(value = "/user")
	public String userRegister() {
		return "user/register";
	}
	
	@GetMapping(value = "/user/list")
	public String userList(Model model) {
		
		model.addAttribute("users", userService.getUserList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "user/list";
	}
	
	@PostMapping(value = "/user/add")
	public String addUser(Address address, AppRecipesUser user) {
		
		System.out.println("Inclusão realizada com sucesso!" + user);
		
		user.setAddress(address);
		
		userService.addUser(user);
		
		msg = "A inclusão do usuário "+user.getName()+" foi realizada com sucesso!";
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String removeUser(@PathVariable Integer id) {
		
		AppRecipesUser userToDelete = userService.getUserById(id);
		
		try {
			
			userService.removeUser(id);
			
			msg = "A exclusão do usuário "+userToDelete.getName()+" foi realizada com sucesso!";
			
		} catch (Exception e) {
			
			msg = "Erro "+e+". Impossível excluir o usuário "+userToDelete.getName()+"!";
			
		}
		
		return "redirect:/user/list";
	}

}