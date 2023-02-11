package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apprecipes.model.domain.Chef;

@Controller
public class ChefController {
	
	@GetMapping(value = "/chef")
	public String chefRegister() {
		return "chef/register";
	}
	
	@PostMapping(value = "/chef/add")
	public String addChef(Chef chef) {
		System.out.println("Inclusão realizada com sucesso!" + chef);
		return "redirect:/";
	}

}