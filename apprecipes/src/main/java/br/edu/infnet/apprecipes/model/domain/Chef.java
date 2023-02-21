package br.edu.infnet.apprecipes.model.domain;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;

public class Chef {
	
	public String name;
	public String clientType;
	public String email;
	
	
	public Chef(String name, String clientType, String email) throws NullOrEmptyAttributeException {
		
		if (name == null || name.isBlank()) {
			throw new NullOrEmptyAttributeException("O nome do cliente deve ser preenchido!");
		}
		
		if (clientType == null || clientType.isBlank()) {
			throw new NullOrEmptyAttributeException("O nome do restaurante deve ser preenchido!");
		}
		
		if (email == null || email.isBlank()) {
			throw new NullOrEmptyAttributeException("O email do chef deve ser preenchido!");
		}
		
		this.name = name;
		this.clientType = clientType;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(";");
		sb.append(clientType);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}
	public String getClientType() {
		return clientType;
	}
	public String getEmail() {
		return email;
	}

}
