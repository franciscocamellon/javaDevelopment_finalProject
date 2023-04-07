package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.service.LayoutConsultancyService;

@Controller
@SessionAttributes("layouts")
public class LayoutConsultancyController {
	
	@Autowired
	private LayoutConsultancyService layoutService;
	
	private String msg;
	
	@GetMapping(value = "/consultancy/layout")
	public String layoutConsultancyRegister() {
		return "layout/register";
	}

	@GetMapping(value = "/consultancy/layout/list")
	public String layoutConsultancyList(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("layouts", layoutService.getLayoutConsultancyList(loggedUser));
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "layout/list";
	}
	
	@PostMapping(value = "/consultancy/layout/add")
	public String addLayoutConsultancy(LayoutConsultancy layoutConsultancy, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		layoutConsultancy.setUser(loggedUser);
		
		layoutService.addLayoutConsultancy(layoutConsultancy);
		
		msg = "A consultoria de layout "+layoutConsultancy.getName()+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/layout/list";
	}
	
	@GetMapping(value = "/consultancy/layout/{id}/delete")
	public String removeLayoutConsultancy(@PathVariable Integer id) {
		
		LayoutConsultancy consultancyToDelete = layoutService.getById(id);
		
		try {
			
			layoutService.removeLayoutConsultancy(id);
			
			msg = "A consultoria de layout "+consultancyToDelete.getName()+" foi deletada com sucesso!";
			
		} catch (Exception e) {
			
			msg = "<strong>Impossível excluir a consultoria de layout "+consultancyToDelete.getName()+"!</strong><br>Erro: <i>"+e+"</i>";
			
		}
		
		return "redirect:/consultancy/layout/list";
	}

}
