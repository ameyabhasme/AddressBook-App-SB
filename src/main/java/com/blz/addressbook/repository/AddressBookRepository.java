package com.blz.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.addressbook.model.Contact;

public interface AddressBookRepository extends JpaRepository<Contact, Integer>{

}
