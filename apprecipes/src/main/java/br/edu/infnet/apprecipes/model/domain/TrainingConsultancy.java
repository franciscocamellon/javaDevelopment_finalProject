package br.edu.infnet.apprecipes.model.domain;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class TrainingConsultancy extends Consultancy {
	
	private String trainingType;
	private int qtyPeople;
	private float qtyTrainingHours;

	public TrainingConsultancy(String contractType, float qtyHours, float cost, float trainingHours) throws ZeroCostException, NullOrEmptyAttributeException {
		super(contractType, qtyHours, cost);
		this.qtyTrainingHours = trainingHours;
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
