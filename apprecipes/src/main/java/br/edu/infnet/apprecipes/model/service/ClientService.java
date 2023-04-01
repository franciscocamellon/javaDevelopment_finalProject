package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Client addClient(Client client) {
		return clientRepository.save(client);
	}
	
	public void removeClient(Integer userId) {
		clientRepository.deleteById(userId);
		return;
	}
	
	public Client getClientById(Integer clientId) {
		return clientRepository.findById(clientId).orElse(null);
	}
	
	public Collection<Client> getClientList() {
		return (Collection<Client>) clientRepository.findAll();
	}
	
	public Collection<Client> getClientList(AppRecipesUser user) {
		return clientRepository.getList(user.getId(), Sort.by(Direction.ASC, "name"));
	}

}
