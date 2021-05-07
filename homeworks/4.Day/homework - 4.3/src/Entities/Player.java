package Entities;

import Abstract.Entity;

public class Player implements Entity{
	private int id;
	private String name;
	private String surname;
	private String nationalityId;
	private String dateOfBirth;
	
	public Player() {
		
	}
	
	public Player(int id, String name, String surname, String nationalityId, String dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
