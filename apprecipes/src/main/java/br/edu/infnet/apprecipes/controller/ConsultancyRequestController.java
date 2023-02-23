package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsultancyRequestController {
	
	@GetMapping(value = "/consultancy/request")
	public String consultancyRequestRegister() {
		return "request/register";
	}
	
	@GetMapping(value = "/consultancy/request/list")
	public String consultancyRequestList(Model model) {
		return "request/list";
	}
	
	@PostMapping(value = "/consultancy/request/add")
	public String addConsultancyRequest() {
		
		return consultancyRequestRegister();
	}

}
