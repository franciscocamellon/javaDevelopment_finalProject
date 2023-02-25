package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.repository.MenuConsultancyRepository;
import br.edu.infnet.apprecipes.model.repository.TrainingConsultancyRepository;

@Controller
@SessionAttributes("trainings")
public class TrainingConsultancyController {
	
	private String msg;
	
	@GetMapping(value = "/consultancy/training")
	public String trainingConsultancyRegister() {
		return "training/register";
	}
	
	@GetMapping(value = "/consultancy/training/list")
	public String trainingConsultancyList(Model model) {
		
		model.addAttribute("trainings", TrainingConsultancyRepository.getTrainingConsultancyList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "training/list";
	}
	
	@PostMapping(value = "/consultancy/training/add")
	public String addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		
		System.out.println("Inclusão realizada com sucesso!" + trainingConsultancy);
		
		TrainingConsultancyRepository.addTrainingConsultancy(trainingConsultancy);
		
		msg = "A consultoria de treinamento "+trainingConsultancy+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/training/list";
	}
	
	@GetMapping(value = "/consultancy/training/{id}/delete")
	public String removeTrainingConsultancy(@PathVariable Integer id) {
		
		TrainingConsultancy training = TrainingConsultancyRepository.removeTrainingConsultancy(id);
		
		msg = "A consultoria de treinamento "+training+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/menu/list";
	}

}
