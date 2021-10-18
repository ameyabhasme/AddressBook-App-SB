package com.blz.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
	
	@RequestMapping(value= {" ", "/", "/get"})
	public ResponseEntity<String> getAll(){
		return new ResponseEntity<String>("GET call successful", HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getById(@PathVariable ("id") int id){
		return new ResponseEntity<String>("GET call for Id successful", HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> post(){
		return new ResponseEntity<String>("POST call successful", HttpStatus.OK);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<String> put(@PathVariable ("id") int id){
		return new ResponseEntity<String>("PUT call successful", HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		return new ResponseEntity<String>("DELETE call successful", HttpStatus.OK);
	}
}
