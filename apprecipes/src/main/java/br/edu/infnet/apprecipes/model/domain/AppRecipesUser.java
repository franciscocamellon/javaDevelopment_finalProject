package br.edu.infnet.apprecipes.model.domain;

public class AppRecipesUser {
	
	private Integer id;
	private String name;
	private String password;
	private String email;
	private int age;
	private String zip;
	private String address;
	
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
				age,
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

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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
}
