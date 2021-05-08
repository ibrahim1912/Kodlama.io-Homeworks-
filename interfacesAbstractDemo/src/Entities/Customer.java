package Entities;

import java.util.Date;

public class Customer {

	private int id;
	private String firsName;
	private String lastName;
	private Date dateOfBirthDate;
	private String nationalityId;
	private int dateBirth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirthDate() {
		return dateOfBirthDate;
	}
	public void setDateOfBirthDate(Date dateOfBirthDate) {
		this.dateOfBirthDate = dateOfBirthDate;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(int dateBirth) {
		this.dateBirth = dateBirth;
	}
}
