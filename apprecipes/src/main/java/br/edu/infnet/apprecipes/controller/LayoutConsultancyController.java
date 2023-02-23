package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LayoutConsultancyController {
	
	@GetMapping(value = "/consultancy/layout")
	public String layoutConsultancyRegister() {
		return "layout/register";
	}

	@GetMapping(value = "/consultancy/layout/list")
	public String layoutConsultancyList(Model model) {
		return "layout/list";
	}
	
	@PostMapping(value = "/consultancy/layout/add")
	public String addLayoutConsultancy() {
		
		return "layout/register";
	}

}
