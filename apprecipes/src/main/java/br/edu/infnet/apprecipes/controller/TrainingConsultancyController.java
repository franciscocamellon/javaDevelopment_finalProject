package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.service.TrainingConsultancyService;

@Controller
@SessionAttributes("trainings")
public class TrainingConsultancyController {
	
	@Autowired
	private TrainingConsultancyService trainingService;
	
	private String msg;
	
	@GetMapping(value = "/consultancy/training")
	public String trainingConsultancyRegister() {
		return "training/register";
	}
	
	@GetMapping(value = "/consultancy/training/list")
	public String trainingConsultancyList(Model model) {
		
		model.addAttribute("trainings", trainingService.getTrainingConsultancyList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "training/list";
	}
	
	@PostMapping(value = "/consultancy/training/add")
	public String addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		
		System.out.println("Inclusão realizada com sucesso!" + trainingConsultancy);
		
		trainingService.addTrainingConsultancy(trainingConsultancy);
		
		msg = "A consultoria de treinamento "+trainingConsultancy+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/training/list";
	}
	
	@GetMapping(value = "/consultancy/training/{id}/delete")
	public String removeTrainingConsultancy(@PathVariable Integer id) {
		
		TrainingConsultancy training = trainingService.removeTrainingConsultancy(id);
		
		msg = "A consultoria de treinamento "+training+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/menu/list";
	}

}
