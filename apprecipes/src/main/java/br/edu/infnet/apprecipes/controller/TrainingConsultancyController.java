package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainingConsultancyController {
	
	@GetMapping(value = "/consultancy/training")
	public String trainingConsultancyRegister() {
		return "training/register";
	}
	
	@GetMapping(value = "/consultancy/training/list")
	public String trainingConsultancyList(Model model) {
		return "training/list";
	}
	
	@PostMapping(value = "/consultancy/training/add")
	public String addTrainingConsultancy() {
		
		return "training/register";
	}

}
