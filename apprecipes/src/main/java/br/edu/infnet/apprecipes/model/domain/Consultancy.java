package br.edu.infnet.apprecipes.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

@Entity
@Table(name = "TableConsultancy")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Consultancy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String contractType;
	private float qtyHours;
	private float cost;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private AppRecipesUser user;
	@ManyToMany(mappedBy = "consultancies")
	private List<ConsultancyRequest> consultancyRequests;
	
	public Consultancy() {
		
	}
	
	public Consultancy(String contractType, float qtyHours, float cost) throws ZeroCostException, NullOrEmptyAttributeException {
		
		if (contractType == null || contractType.isBlank()) {
			throw new NullOrEmptyAttributeException("O tipo do contrato deve ser preenchido!");
		}
		if (cost == 0) {
			throw new ZeroCostException("O custo da consultoria está zerado!");
		}
		
		if (cost < 0) {
			throw new ZeroCostException("O custo da consultoria está negativo!");
		}
		
		this.contractType = contractType;	
		this.qtyHours = qtyHours;
		this.cost = cost;
	}
	
	public abstract float costCalculator();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(contractType);
		sb.append(";");
		sb.append(qtyHours);
		sb.append(";");
		sb.append(cost);
		
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

	public void setName(String name) {
		this.name = name;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public float getQtyHours() {
		return qtyHours;
	}

	public void setQtyHours(float qtyHours) {
		this.qtyHours = qtyHours;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public AppRecipesUser getUser() {
		return user;
	}

	public void setUser(AppRecipesUser user) {
		this.user = user;
	}

	public List<ConsultancyRequest> getConsultancyRequests() {
		return consultancyRequests;
	}

	public void setConsultancyRequests(List<ConsultancyRequest> consultancyRequests) {
		this.consultancyRequests = consultancyRequests;
	}


}
