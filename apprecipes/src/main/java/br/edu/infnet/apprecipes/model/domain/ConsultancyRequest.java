package br.edu.infnet.apprecipes.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutClientException;
import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutConsultancyException;

@Entity
@Table(name = "TableConsultancyRequest")
public class ConsultancyRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float totalCost;
	private LocalDateTime requestDate;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idCliente")
	private Client client;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Consultancy> consultancies;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private AppRecipesUser user;
	
	public ConsultancyRequest() {
	}

	public ConsultancyRequest(Client client, List<Consultancy> consultancies) throws RequestWithoutClientException, RequestWithoutConsultancyException {
		this();
		
		if (client == null) {
			throw new RequestWithoutClientException("Não existe um cliente associado a esta requisição!");
		}
		
		if (consultancies.size() == 0) {
			throw new RequestWithoutConsultancyException("Não existem consultorias associados a esta requisição!");
		}
		this.requestDate = LocalDateTime.now();
		this.client = client;
		this.consultancies = consultancies;
	}
	
	public void printReport() {
		System.out.println("Requisição: " + this);
		System.out.println("Cliente: " + client);
		System.out.println("Qtde consultorias: " + consultancies.size());
		System.out.println("Consultorias: ");
		for (Consultancy consultancy : consultancies) {
			System.out.println("- " + consultancy.getClass());
		}
	}
	
	private float consultancyTotalCostCalculator(List<Consultancy> consultancies) {
		
		float cost = 0;
		
		for (Consultancy consultancy : consultancies) {
			
			//cost = cost + consultancy.costCalculator();
			cost = consultancy.getCost() + 10000;
		}
		return cost;
	}
	
	public String createFileLine() {
		
		return "Requisição: " + this + ";" + 
				"Cliente requisitante: " + this.getClient() + ";" + 
				"Qtde de consultorias: " + this.getConsultancies().size() + ";" + 
				"Custo da consultoria: R$" + this.consultancyTotalCostCalculator(consultancies) + "\r\n";
	}
	
	@Override
	public String toString() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s", this.getClient(), "Custo:" + this.consultancyTotalCostCalculator(consultancies), requestDate.format(format));
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Consultancy> getConsultancies() {
		return consultancies;
	}

	public void setConsultancies(List<Consultancy> consultancies) {
		this.consultancies = consultancies;
	}

	public AppRecipesUser getUser() {
		return user;
	}

	public void setUser(AppRecipesUser user) {
		this.user = user;
	}

}
