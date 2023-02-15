package br.edu.infnet.apprecipes.model.domain;

public class AppRecipesUser {
	
	private String name;
	private String password;
	private String email;
	private String[] characteristics;
	private String type;
	private String sector;
	private int age;
	private float salary;
	
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
				"O usuário %s tem as credenciais %s e %s, %d anos e ganha R$%.2f. "
				+ "é um usuário do tipo %s, atua no setor %s e tem %d características", 
				name,
				email,
				password,
				age,
				salary,
				type,
				sector,
				characteristics.length
			);
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


	public String[] getCharacteristics() {
		return characteristics;
	}


	public void setCharacteristics(String[] characteristics) {
		this.characteristics = characteristics;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
}
