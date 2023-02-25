package br.edu.infnet.apprecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.repository.MenuConsultancyRepository;

@Controller
@SessionAttributes("menus")
public class MenuConsultancyController {
	
	private String msg;
	
	@GetMapping(value = "/consultancy/menu")
	public String menuConsultancyRegister() {
		return "menu/register";
	}
	
	@GetMapping(value = "/consultancy/menu/list")
	public String menuConsultancyList(Model model) {
		
		model.addAttribute("menus", MenuConsultancyRepository.getMenuConsultancyList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "menu/list";
	}
	
	@PostMapping(value = "/consultancy/menu/add")
	public String addMenuConsultancy(MenuConsultancy menuConsultancy) {
		
		System.out.println("Inclusão realizada com sucesso!" + menuConsultancy);
		
		MenuConsultancyRepository.addMenuConsultancy(menuConsultancy);
		
		msg = "A consultoria de menu "+menuConsultancy+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/menu/list";
	}
	
	@GetMapping(value = "/consultancy/menu/{id}/delete")
	public String removeMenuConsultancy(@PathVariable Integer id) {
		
		MenuConsultancy menu = MenuConsultancyRepository.removeMenuConsultancy(id);
		
		msg = "A consultoria de menu "+menu+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/menu/list";
	}

}
