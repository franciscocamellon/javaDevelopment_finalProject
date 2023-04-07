package br.edu.infnet.apprecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.apprecipes.model.service.AddressService;

@Controller
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping(value = "/cep")
	public String getUserZip(Model model, @RequestParam String cep) {
		
		model.addAttribute("address", addressService.getByZIP(cep));
		
		return "user/register";
	}
	
	@PostMapping(value = "/client/cep")
	public String getClientZip(Model model, @RequestParam String cep) {
		
		model.addAttribute("address", addressService.getByZIP(cep));
		
		return "client/register";
	}

}
