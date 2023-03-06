package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.Client;

@Repository
public class ClientRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Client> mapClientList = new HashMap<Integer, Client>();
	
	public boolean addClient(Client client) {
		
		client.setId(id++);
		
		try {
			mapClientList.put(client.getId(), client);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public Client removeClient(Integer userId) {
		
		return mapClientList.remove(userId);
		
	}
	
	public Collection<Client> getClientList() {
		return mapClientList.values();
	}


}
