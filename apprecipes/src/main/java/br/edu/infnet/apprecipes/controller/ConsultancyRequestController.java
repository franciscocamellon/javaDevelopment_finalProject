package br.edu.infnet.apprecipes.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.domain.Consultancy;
import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutClientException;
import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutConsultancyException;
import br.edu.infnet.apprecipes.model.repository.ClientRepository;
import br.edu.infnet.apprecipes.model.repository.ConsultancyRequestRepository;

@Controller
public class ConsultancyRequestController {
	
	private String msg;
	
	@GetMapping(value = "/consultancy/request")
	public String consultancyRequestRegister() {
		
		return "request/register";
	}
	
	@GetMapping(value = "/consultancy/request/list")
	public String consultancyRequestList(Model model) {
		
		model.addAttribute("requests", ConsultancyRequestRepository.getRequestList());
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "request/list";
	}
	
	@PostMapping(value = "/consultancy/request/add")
	public String addConsultancyRequest(@RequestParam String client, @RequestParam List<String> service, @RequestParam float totalCost) {
		
		String[] arrOfStr = client.split(";", 3);
		Client objClient = null;
		try {
			objClient = new Client(arrOfStr[0], arrOfStr[1], arrOfStr[2]);
		} catch (NullOrEmptyAttributeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ConsultancyRequest request = null;
		try {
			request = new ConsultancyRequest(objClient, service);
			request.setTotalCost(totalCost);
		} catch (RequestWithoutClientException | RequestWithoutConsultancyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inclusão realizada com sucesso!" + request);
		
		ConsultancyRequestRepository.addRequest(request);
		
		msg = "A requisição do cliente "+request.getClient()+" foi realizada com sucesso!";
		
		return "redirect:/consultancy/request/list";
	}
	
	@GetMapping(value = "/consultancy/request/{id}/delete")
	public String removeConsultancyRequest(@PathVariable Integer id) {
		
		ConsultancyRequest request = ConsultancyRequestRepository.removeRequest(id);
		
		msg = "A requisição do usuário "+request.getClient()+" foi deletada com sucesso!";
		
		return "redirect:/consultancy/request/list";
	}

}
