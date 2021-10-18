package com.blz.addressbook.model;

import com.blz.addressbook.dto.ContactDTO;

public class Contact {

	private int id;
	private String firstName;
	private String lastName;
	
	
	public Contact(int id, ContactDTO contactDTO) {
		this.id = id;
		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
	}
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
