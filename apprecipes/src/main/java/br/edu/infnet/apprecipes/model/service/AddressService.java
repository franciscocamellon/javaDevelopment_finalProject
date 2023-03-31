package br.edu.infnet.apprecipes.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.clients.IAddressClient;
import br.edu.infnet.apprecipes.model.domain.Address;

@Service
public class AddressService {
	
	@Autowired
	private IAddressClient addressClient;
	
	public Address getByZIP(String cep) {
		return addressClient.getByZIP(cep);
	}

}
