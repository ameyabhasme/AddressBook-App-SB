package com.blz.addressbook.services;

import java.util.List;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.model.Contact;

public interface IAddressBookService {
	
	List<Contact> getAll();

	Contact getById(int id);

	Contact post(ContactDTO contactDTO);

	Contact put(int id, ContactDTO contactDTO);
	
	void delete(int id);
}
