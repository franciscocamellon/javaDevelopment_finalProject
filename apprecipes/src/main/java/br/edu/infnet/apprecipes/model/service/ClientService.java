package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public boolean addClient(Client client) {
		return clientRepository.addClient(client);
	}
	
	public Client removeClient(Integer userId) {
		return clientRepository.removeClient(userId);
	}
	
	public Collection<Client> getClientList() {
		return clientRepository.getClientList();
	}

}
