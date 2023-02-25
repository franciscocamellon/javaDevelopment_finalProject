package br.edu.infnet.apprecipes.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutClientException;
import br.edu.infnet.apprecipes.model.exceptions.RequestWithoutConsultancyException;

public class ConsultancyRequest {
	
	private Integer id;
	//private List<Consultancy> service;
	private List<String> service;
	private float totalCost;
	private Client client;
	private LocalDateTime requestDate;
	
	public ConsultancyRequest(Client client, List<String> service) throws RequestWithoutClientException, RequestWithoutConsultancyException {
		
		if (client == null) {
			throw new RequestWithoutClientException("Não existe um cliente associado a esta requisição!");
		}
		
		if (service == null) {
			throw new RequestWithoutConsultancyException("Não existem consultorias associados a esta requisição!");
		}
		requestDate = LocalDateTime.now();
		this.client = client;
		this.service = service;
	}
	
	public void printReport() {
		System.out.println("Requisição: " + this);
		System.out.println("Cliente: " + client);
		System.out.println("Qtde consultorias: " + service.size());
		System.out.println("Consultorias: ");
		for (String consultancy : service) {
			System.out.println("- " + consultancy.getClass());
		}
	}
	
	private float consultancyTotalCostCalculator(List<String> service) {
		
		float cost = 0;
		
		for (String consultancy : service) {
			
			//cost = cost + consultancy.costCalculator();
			cost = cost + 10000;
		}
		return cost;
	}
	
	public String createFileLine() {
		
		return "Requisição: " + this + ";" + 
				"Cliente requisitante: " + this.getClient() + ";" + 
				"Qtde de consultorias: " + this.getService().size() + ";" + 
				"Custo da consultoria: R$" + this.consultancyTotalCostCalculator(service) + "\r\n";
	}
	
	@Override
	public String toString() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s", this.getClient(), "Custo:" + this.consultancyTotalCostCalculator(service), requestDate.format(format));
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getService() {
		return service;
	}

	public void setService(List<String> service) {
		this.service = service;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}

}
