package br.edu.infnet.apprecipes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.service.UserService;

@Controller
@SessionAttributes("user")
public class AccessController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/login")
	public String loginScreen() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String password) {
		
		AppRecipesUser user = new AppRecipesUser(email, password);
		
		user = userService.authenticate(user);
		
		if (user != null) {
			model.addAttribute("user", user);
			
			return "redirect:/home";
		}
		
		model.addAttribute("mensagem", "As credenciais para o email "+ email + " estão incorretas ou são inexistentes.");
		
		return loginScreen();
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

}
