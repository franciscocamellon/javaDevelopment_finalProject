package br.edu.infnet.apprecipes.model.domain;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class LayoutConsultancy extends Consultancy {

	private String layoutType;
	private String kitchenType;
	private boolean delivery;
	
	public LayoutConsultancy(String contractType, float qtyHours, float cost, boolean delivery) throws ZeroCostException, NullOrEmptyAttributeException {
		super(contractType, qtyHours, cost);
		this.delivery = delivery;
	}

	@Override
	public float costCalculator() {
		if (delivery) {
			return this.getCost() * super.getQtyHours();
		}
		return this.getCost() * super.getQtyHours() + 1000;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(layoutType);
		sb.append(";");
		sb.append(kitchenType);
		sb.append(";");
		sb.append(delivery ? "Delivery" : "Restaurante");
		
		return sb.toString();
	}

	public String getLayoutType() {
		return layoutType;
	}

	public void setLayoutType(String layoutType) {
		this.layoutType = layoutType;
	}

	public String getKitchenType() {
		return kitchenType;
	}

	public void setKitchenType(String kitchenType) {
		this.kitchenType = kitchenType;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

}
