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
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.service.MenuConsultancyService;

@Controller
@SessionAttributes("menus")
public class MenuConsultancyController {
	
	@Autowired
	private MenuConsultancyService menuService;
	
	private String msg;
	
	@GetMapping(value = "/consultancy/menu")
	public String menuConsultancyRegister() {
		return "menu/register";
	}
	
	@GetMapping(value = "/consultancy/menu/list")
	public String menuConsultancyList(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("menus", menuService.getMenuConsultancyList(loggedUser));
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "menu/list";
	}
	
	@PostMapping(value = "/consultancy/menu/add")
	public String addMenuConsultancy(MenuConsultancy menuConsultancy, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		menuConsultancy.setUser(loggedUser);
		
		menuService.addMenuConsultancy(menuConsultancy);
		
		msg = "A consultoria de menu "+menuConsultancy.getName()+" foi adicionada com sucesso!";
		
		return "redirect:/consultancy/menu/list";
	}
	
	@GetMapping(value = "/consultancy/menu/{id}/delete")
	public String removeMenuConsultancy(@PathVariable Integer id) {
		
		MenuConsultancy menuToDelete = menuService.getById(id);
		
		try {
			
			menuService.removeMenuConsultancy(id);
			
			msg = "A consultoria de menu "+menuToDelete.getName()+" foi deletada com sucesso!";
			
		} catch (Exception e) {
			
			msg = "Erro "+e+". Impossível excluir a consultoria de menu "+menuToDelete.getName()+"!";
			
		}
		
		return "redirect:/consultancy/menu/list";
	}

}
