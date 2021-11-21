package com.blz.addressbook.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class ContactDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact Name Invalid")
	public String fullName;

	@NotNull(message = "Phone number should be of 10 digits")
	public long phone;

	@Pattern(regexp = "^[A-Za-z0-9,.()@&*\\s]{4,}$", message = "Address should be at least 4 letters long")
	public String address;

	@NotBlank(message = "City can't be empty")
	public String city;

	@NotBlank(message = "State can't be empty")
	public String state;

	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$", message = "Zip Code should be of 6 digits and can'sstart with 0")
	public String zipCode;

}
