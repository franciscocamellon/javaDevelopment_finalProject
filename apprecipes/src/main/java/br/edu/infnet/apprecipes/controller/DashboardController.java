package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.service.ClientService;
import br.edu.infnet.apprecipes.model.service.ConsultancyRequestService;
import br.edu.infnet.apprecipes.model.service.ConsultancyService;
import br.edu.infnet.apprecipes.model.service.UserService;

@Controller
@SessionAttributes("requests")
public class DashboardController {
	
	@Autowired
	private ConsultancyRequestService requestService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ConsultancyService consultancyService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/home")
	public String getDashbordData(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("requests", requestService.getTotalRequest(loggedUser));
		
		model.addAttribute("clients", clientService.getTotalClients(loggedUser));
		
		model.addAttribute("consultancies", consultancyService.getTotalConsultancies(loggedUser));
		
		model.addAttribute("users", userService.getTotalUsers(loggedUser));
		
		return "index";
	}

}
