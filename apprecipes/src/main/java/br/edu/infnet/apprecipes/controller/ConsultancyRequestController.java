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
import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;
import br.edu.infnet.apprecipes.model.service.ClientService;
import br.edu.infnet.apprecipes.model.service.ConsultancyRequestService;
import br.edu.infnet.apprecipes.model.service.ConsultancyService;

@Controller
@SessionAttributes("requests")
public class ConsultancyRequestController {
	
	@Autowired
	private ConsultancyRequestService requestService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private ConsultancyService consultancyService;
	
	private String msg;
	
	@GetMapping(value = "/consultancy/request")
	public String consultancyRequestRegister(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("clients", clientService.getClientList(loggedUser));
		
		model.addAttribute("consultancies", consultancyService.getConsultancyList(loggedUser));
		
		return "request/register";
	}
	
	@GetMapping(value = "/consultancy/request/list")
	public String consultancyRequestList(Model model, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		model.addAttribute("requests", requestService.getConsultancyRequestList(loggedUser));
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "request/list";
	}
	
	@PostMapping(value = "/consultancy/request/add")
	public String addConsultancyRequest(ConsultancyRequest consultancyRequest, @SessionAttribute("user") AppRecipesUser loggedUser) {
		
		consultancyRequest.setUser(loggedUser);
		
		requestService.addConsultancyRequest(consultancyRequest);
		
		msg = "A solicitação de consultoria foi adicionada com sucesso!";
		
		return "redirect:/consultancy/request/list";
	}
	
	@GetMapping(value = "/consultancy/request/{id}/delete")
	public String removeConsultancyRequest(@PathVariable Integer id) {
		
		ConsultancyRequest request = requestService.getById(id);
		
		requestService.removeConsultancyRequest(id);
		
		msg = "A requisição do usuário "+request.getClient()+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/request/list";
	}

}
