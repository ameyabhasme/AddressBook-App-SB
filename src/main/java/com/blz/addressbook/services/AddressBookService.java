package com.blz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {

	private List<Contact> addressBookList = new ArrayList<>();

	@Override
	public List<Contact> getAll() {
		return addressBookList;
	}

	@Override
	public Contact getById(int id) {
		return addressBookList.get(id - 1);
	}

	@Override
	public Contact post(ContactDTO contactDTO) {
		Contact contact = null;
		contact = new Contact(addressBookList.size() + 1, contactDTO);
		addressBookList.add(contact);
		return contact;
	}

	@Override
	public Contact put(int id, ContactDTO contactDTO) {
		Contact contact = this.getById(id);
		contact.setFirstName(contactDTO.firstName);
		contact.setLastName(contactDTO.lastName);
		addressBookList.set(id-1, contact);
		return contact;
	}

	@Override
	public void delete(int id) {
		addressBookList.remove(id);
	}

}
