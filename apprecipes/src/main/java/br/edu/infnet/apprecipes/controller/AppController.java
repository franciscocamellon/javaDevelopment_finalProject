package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String indexScreen() {
		return "redirect:/login";
	}
	
	@GetMapping(value = "/home")
	public String homeScreen() {
		return "index";
	}
	
	@GetMapping(value = "/maintenance")
	public String maintenanceScreen() {
		return "maintenance";
	}

}