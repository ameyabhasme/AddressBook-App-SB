package com.blz.addressbook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.dto.ResponseDTO;
import com.blz.addressbook.model.Contact;
import com.blz.addressbook.services.IAddressBookService;

@CrossOrigin(maxAge = 3600)
@RestController
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@CrossOrigin(origins = "http://localhost:4300/")
	@GetMapping(value= {" ", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAll(){
		List<Contact> addressbookList = null;
		addressbookList = addressBookService.getAll();
		ResponseDTO responseDTO = new ResponseDTO("GET call successful", addressbookList);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4300/")
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getById(@PathVariable ("id") int id){
		Contact contact = null;
		contact = addressBookService.getById(id);
		ResponseDTO responseDTO = new ResponseDTO("GET call successful", contact);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4300/")
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> post(@Valid @RequestBody ContactDTO contactDTO){
		Contact contact = null;
		contact = addressBookService.postContact(contactDTO);
		ResponseDTO responseDTO = new ResponseDTO("POST call successful", contact);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4300/")	
	@PutMapping("/put/{id}")
	public ResponseEntity<ResponseDTO> put(@Valid @PathVariable ("id") int id, @RequestBody ContactDTO contactDTO){
		Contact contact = null;
		contact = addressBookService.putContact(id, contactDTO);	
		ResponseDTO responseDTO = new ResponseDTO("PUT call successful", contact);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);

	}
	
	@CrossOrigin(origins = "http://localhost:4300/")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(@PathVariable("id") int id){
		addressBookService.deleteContact(id);
		ResponseDTO responseDTO = new ResponseDTO("DELETE call successful. ", "Deleted Id: " + id);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
}
