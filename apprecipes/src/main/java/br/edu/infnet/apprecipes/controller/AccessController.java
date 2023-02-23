package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.repository.AccessRepository;

@Controller
public class AccessController {
	
	@GetMapping(value = "/login")
	public String loginScreen() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String password) {
		
		AppRecipesUser user = new AppRecipesUser(email, password);
		
		if (AccessRepository.authentication(user) != null) {
			return "redirect:/home";
		}
		
		model.addAttribute("mensagem", "As credenciais para o email "+ email + " estão incorretas");
		
		//return "redirect:/login";
		return loginScreen();
	}

}
