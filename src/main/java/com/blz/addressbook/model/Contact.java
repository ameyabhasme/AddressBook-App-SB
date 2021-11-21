package com.blz.addressbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.blz.addressbook.dto.ContactDTO;

import lombok.Data;

@Entity
@Table(name="addressbook")
public @Data class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullName;
	private long phone;
	private String address;
	private String state;
	private String city;
	private String zipCode;

	public Contact() {
	}

	public Contact(ContactDTO contactDTO) {
		this.updateData(contactDTO);
	}

	public void updateData(ContactDTO contactDTO) {
		this.fullName = contactDTO.fullName;
		this.phone = contactDTO.phone;
		this.address = contactDTO.address;
		this.city = contactDTO.city;
		this.state = contactDTO.state;
		this.zipCode = contactDTO.zipCode;
	}
}
