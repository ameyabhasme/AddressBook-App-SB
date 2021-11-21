package com.blz.addressbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.exceptions.CustomExceptions;
import com.blz.addressbook.model.Contact;
import com.blz.addressbook.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository contactRepo;

	@Override
	public List<Contact> getAll() {
		return contactRepo.findAll();
	}

	@Override
	public Contact getById(int id) {
		return contactRepo.findById(id).orElseThrow(() -> new CustomExceptions("Contact with Id: " + id + " does not exist."));
	}

	@Override
	public Contact postContact(ContactDTO contactDTO) {
		Contact contact = null;
		contact = new Contact(contactDTO);
		log.debug("Emp data: "+ contact.toString());
		return contactRepo.save(contact);
	}

	@Override
	public Contact putContact(int id, ContactDTO contactDTO) {
		Contact contact = this.getById(id);
		contact.updateData(contactDTO);
		return contactRepo.save(contact);
	}

	@Override
	public void deleteContact(int id) {
		Contact contact = this.getById(id);
		contactRepo.delete(contact);
	}

}
