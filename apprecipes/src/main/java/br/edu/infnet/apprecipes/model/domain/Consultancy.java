package br.edu.infnet.apprecipes.model.domain;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public abstract class Consultancy {
	
	private String contractType;
	private float qtyHours;
	private float cost;
	
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

	public String getContractType() {
		return contractType;
	}

	public float getCost() {
		return cost;
	}

	public float getQtyHours() {
		return qtyHours;
	}
	
}
