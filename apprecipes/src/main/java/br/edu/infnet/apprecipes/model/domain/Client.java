package br.edu.infnet.apprecipes.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;

@Entity
@Table(name = "TableClient")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String enterpriseName;
	private String clientType;
	private String email;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private AppRecipesUser user;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idAddress")
	private Address address;
	
	public Client() {
		
	}
	
	public Client(String name, String clientType, String email) throws NullOrEmptyAttributeException {
		
		this();
		
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

	public void setName(String name) {
		this.name = name;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AppRecipesUser getUser() {
		return user;
	}

	public void setUser(AppRecipesUser user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
