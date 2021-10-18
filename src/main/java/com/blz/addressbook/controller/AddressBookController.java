package com.blz.addressbook.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.dto.ResponseDTO;
import com.blz.addressbook.model.Contact;

@RestController
public class AddressBookController {
	
	@RequestMapping(value= {" ", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAll(){
		List<Contact> addressbookList = null;
		ResponseDTO responseDTO = new ResponseDTO("GET call successful", addressbookList);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getById(@PathVariable ("id") int id){
		ResponseDTO responseDTO = new ResponseDTO("GET call successful", id);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> post(@RequestBody ContactDTO contactDTO){
		ResponseDTO responseDTO = new ResponseDTO("POST call successful", contactDTO.toString());
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<ResponseDTO> put(@PathVariable ("id") int id){
		ResponseDTO responseDTO = new ResponseDTO("PUT call successful", id);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(@PathVariable("id") int id){
		ResponseDTO responseDTO = new ResponseDTO("DELETE call successful", id);
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
}
