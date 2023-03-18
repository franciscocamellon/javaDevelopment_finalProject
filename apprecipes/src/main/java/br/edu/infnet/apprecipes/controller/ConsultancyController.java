package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.Consultancy;
import br.edu.infnet.apprecipes.model.service.ConsultancyService;

@Controller
public class ConsultancyController {
	
	@Autowired
	private ConsultancyService consultancyService;
	
	private String msg;

	@GetMapping(value = "/consultancy/list")
	public String consultancyList(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("consultancies", consultancyService.getConsultancyList(loggedUser));
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "consultancy/list";
	}
	
	@GetMapping(value = "/consultancy/{id}/delete")
	public String removeConsultancy(@PathVariable Integer id) {
		
		Consultancy consultancy = consultancyService.getById(id);
		
		consultancyService.removeConsultancy(id);
		
		msg = "A consultoria "+consultancy.getName()+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/list";
	}

}
