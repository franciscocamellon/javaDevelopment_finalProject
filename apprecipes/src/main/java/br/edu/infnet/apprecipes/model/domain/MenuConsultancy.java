package br.edu.infnet.apprecipes.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

@Entity
@Table(name = "TableMenuConsultancy")
public class MenuConsultancy extends Consultancy {

	private String menuType;
	private String cuisine;
	private boolean vegan;
	
	public MenuConsultancy() {
		super();
	}

	public MenuConsultancy(String contractType, float qtyHours, float cost, boolean vegan) throws ZeroCostException, NullOrEmptyAttributeException {
		super(contractType, qtyHours, cost);
		this.vegan = vegan;
	}
	
	public MenuConsultancy(String contractType, float qtyHours, float cost, boolean vegan, String menuType, String cuisine) throws ZeroCostException, NullOrEmptyAttributeException {
		this(contractType, qtyHours, cost, vegan);
		this.menuType = menuType;
		this.cuisine = cuisine;
	}

	@Override
	public float costCalculator() {
		if (vegan) {
			return this.getCost() * super.getCost() + 20000;
		}
		return this.getCost() * super.getCost();
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

}
