package com.blz.addressbook.dto;

public class ContactDTO {

	public String firstName;
	public String lastName;

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName;
	}
}
