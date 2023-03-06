package br.edu.infnet.apprecipes.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.service.ClientService;

@Controller
@SessionAttributes("clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	private String msg;
	
	@GetMapping(value = "/client")
	public String clientRegister() {
		return "client/register";
	}
	
	@GetMapping(value = "/client/list")
	public String clientList(Model model) {
		
		Collection<Client> clients = clientService.getClientList();
		
		model.addAttribute("clients", clients);
		
		model.addAttribute("message", msg);
		
		msg = null;
		
		return "client/list";
	}
	
	@PostMapping(value = "/client/add")
	public String addClient(Client client) {
		
		System.out.println("Inclusão realizada com sucesso!" + client);
		
		clientService.addClient(client);
		
		msg = "A inclusão do usuário "+client.getName()+" foi realizada com sucesso!";
		
		return "redirect:/client/list";
	}
	
	@GetMapping(value = "/client/{id}/delete")
	public String removeClient(@PathVariable Integer id) {
		
		Client client = clientService.removeClient(id);
		
		msg = "A exclusão do usuário "+client.getName()+" foi realizada com sucesso!";
		
		return "redirect:/client/list";
	}

}
