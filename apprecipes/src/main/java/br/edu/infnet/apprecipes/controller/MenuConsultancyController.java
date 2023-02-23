package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuConsultancyController {
	
	@GetMapping(value = "/consultancy/menu")
	public String menuConsultancyRegister() {
		return "menu/register";
	}
	
	@GetMapping(value = "/consultancy/menu/list")
	public String menuConsultancyList(Model model) {
		return "menu/list";
	}
	
	@PostMapping(value = "/consultancy/menu/add")
	public String addMenuConsultancy() {
		
		return "menu/register";
	}

}
