package com.blz.addressbook.model;

import com.blz.addressbook.dto.ContactDTO;

import lombok.Data;

public @Data class Contact {

	private int id;
	private String firstName;
	private String lastName;
	
	public Contact() {}
	
	public Contact(int id, ContactDTO contactDTO) {
		this.id = id;
		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
	}
	
}
