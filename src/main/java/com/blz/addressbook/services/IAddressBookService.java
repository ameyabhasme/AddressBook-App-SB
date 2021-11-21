package com.blz.addressbook.services;

import java.util.List;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.model.Contact;

public interface IAddressBookService {
	
	List<Contact> getAll();

	Contact getById(int id);

	Contact postContact(ContactDTO contactDTO);

	Contact putContact(int id, ContactDTO contactDTO);
	
	void deleteContact(int id);
}
