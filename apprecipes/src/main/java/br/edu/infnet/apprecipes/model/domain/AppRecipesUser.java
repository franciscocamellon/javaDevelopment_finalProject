package br.edu.infnet.apprecipes.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TableUser")
public class AppRecipesUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String password;
	private String email;
	private String zip;
	private String address;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Client> clients;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Consultancy> consultancies;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<ConsultancyRequest> consultancyRequests;
	
	public AppRecipesUser() {
		
	}
	
	public AppRecipesUser(String email, String password) {
		this();
		this.setEmail(email);
		this.setPassword(password);
	}
	
	public AppRecipesUser(String name, String email, String password) {
		this(email, password);
		this.setName(name);
	}
	

	@Override
	public String toString() {

		return String.format(
				"O usuário %s tem as credenciais %s e %s, %d anos e seu endereço "
				+ "%s, e seu CEP: %s", 
				name,
				email,
				password,
				address,
				zip
			);
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


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Consultancy> getConsultancies() {
		return consultancies;
	}

	public void setConsultancies(List<Consultancy> consultancies) {
		this.consultancies = consultancies;
	}

	public List<ConsultancyRequest> getConsultancyRequests() {
		return consultancyRequests;
	}

	public void setConsultancyRequests(List<ConsultancyRequest> consultancyRequests) {
		this.consultancyRequests = consultancyRequests;
	}
}
