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
		
		consultancyRequest.setRequestDate();
		consultancyRequest.setTotalCost(consultancyRequest.getConsultancies());
		
		requestService.addConsultancyRequest(consultancyRequest);
		
		msg = "A solicitação adicionada com sucesso!";
		
		return "redirect:/consultancy/request/list";
	}
	
	@GetMapping(value = "/consultancy/request/{id}/delete")
	public String removeConsultancyRequest(@PathVariable Integer id) {
		
		ConsultancyRequest requestToDelete = requestService.getById(id);
		
		try {
			
			requestService.removeConsultancyRequest(id);
			
			msg = "A requisição do usuário "+requestToDelete.getClient().getName()+" foi deletada com sucesso!";
			
		} catch (Exception e) {
			
			msg = "Erro "+e+". Impossível excluir a requisição do usuário "+requestToDelete.getClient().getName()+"!";

		}
		
		return "redirect:/consultancy/request/list";
	}

}
