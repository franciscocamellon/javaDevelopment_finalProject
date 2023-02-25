package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.repository.LayoutConsultancyRepository;
import br.edu.infnet.apprecipes.model.repository.MenuConsultancyRepository;

@Controller
@SessionAttributes("layouts")
public class LayoutConsultancyController {
	
	private String msg;
	
	@GetMapping(value = "/consultancy/layout")
	public String layoutConsultancyRegister() {
		return "layout/register";
	}

	@GetMapping(value = "/consultancy/layout/list")
	public String layoutConsultancyList(Model model) {
		
		model.addAttribute("layouts", LayoutConsultancyRepository.getLayoutConsultancyList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "layout/list";
	}
	
	@PostMapping(value = "/consultancy/layout/add")
	public String addLayoutConsultancy(LayoutConsultancy layoutConsultancy) {
		
		System.out.println("Inclusão realizada com sucesso!" + layoutConsultancy);
		
		LayoutConsultancyRepository.addLayoutConsultancy(layoutConsultancy);
		
		msg = "A consultoria de layout "+layoutConsultancy+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/layout/list";
	}
	
	@GetMapping(value = "/consultancy/layout/{id}/delete")
	public String removeLayoutConsultancy(@PathVariable Integer id) {
		
		LayoutConsultancy layout = LayoutConsultancyRepository.removeLayoutConsultancy(id);
		
		msg = "A consultoria de layout "+layout+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/layout/list";
	}

}
