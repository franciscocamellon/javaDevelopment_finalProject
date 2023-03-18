package br.edu.infnet.apprecipes.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

@Entity
@Table(name = "TableTrainingConsultancy")
public class TrainingConsultancy extends Consultancy {
	
	private String trainingType;
	private int qtyPeople;
	private float qtyTrainingHours;

	public TrainingConsultancy() {
		super();
	}

	public TrainingConsultancy(String contractType, float qtyHours, float cost, float qtyTrainingHours) throws ZeroCostException, NullOrEmptyAttributeException {
		super(contractType, qtyHours, cost);
		this.qtyTrainingHours = qtyTrainingHours;
	}
	
	public TrainingConsultancy(String contractType, float qtyHours, float cost, float qtyTrainingHours, String trainingType, int qtyPeople) throws ZeroCostException, NullOrEmptyAttributeException {
		this(contractType, qtyHours, cost, qtyTrainingHours);
		this.trainingType = trainingType;
		this.qtyPeople = qtyPeople;
	}

	@Override
	public float costCalculator() {
		return this.getQtyPeople() * super.getCost();
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(trainingType);
		sb.append(";");
		sb.append(qtyPeople);
		sb.append(";");
		sb.append(qtyTrainingHours);
		
		return sb.toString();
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public int getQtyPeople() {
		return qtyPeople;
	}

	public void setQtyPeople(int qtyPeople) {
		this.qtyPeople = qtyPeople;
	}

	public float getQtyTrainingHours() {
		return qtyTrainingHours;
	}

	public void setQtyTrainingHours(float qtyTrainingHours) {
		this.qtyTrainingHours = qtyTrainingHours;
	}

}
