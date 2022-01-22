package samplecustomercontrol.entities;


import samplecustomercontrol.abstracts.Entity;

public class Customer implements Entity{
	public int id;
	public String name;
	public String surname;
	public String nationalityId;
	public int birthYear;
	public Customer(int id, String name, String surname, String nationalityId, int birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	 
}
