package pl.magda.crmsystem.model;

public class Contact {
	
	private Integer idcontact;
	private String firstName;
	private String lastName;
	private String companyName;
	private String email;
	private String phone;
	
	public Contact(Integer idcontact, String firstName, String lastName, String companyName, String email,
			String phone) {
		super();
		this.idcontact = idcontact;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.email = email;
		this.phone = phone;
	}

	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdcontact() {
		return idcontact;
	}

	public void setIdcontact(Integer idcontact) {
		this.idcontact = idcontact;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
