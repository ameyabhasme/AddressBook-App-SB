package com.blz.addressbook.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class ContactDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact First Name Invalid")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact First Name Invalid")
	public String lastName;

}
