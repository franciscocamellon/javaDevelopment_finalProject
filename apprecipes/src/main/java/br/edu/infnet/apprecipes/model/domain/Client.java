package br.edu.infnet.apprecipes.model.domain;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;

public class Client {
	
	private Integer id;
	public String name;
	public String enterpriseName;
	public String clientType;
	public String email;
	
	
	public Client(String name, String clientType, String email) throws NullOrEmptyAttributeException {
		
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
	
	public Client(String name, String clientType, String email, String enterpriseName) throws NullOrEmptyAttributeException {
		this(name, clientType, email);
		this.enterpriseName = enterpriseName;
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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

}
