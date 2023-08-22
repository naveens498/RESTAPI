package com.example.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.day4.model.model;
import com.example.day4.service.service;

@RestController

public class controller {

	@Autowired
	public service ser;
	@PostMapping("/studentDet")
	
	public model savestudentdet(@RequestBody model m)
	{
		return ser.saveDetailsModel(m);
	}
	@GetMapping
	public List<model> savestudentdet()
	{
		return ser.getDetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletestud(@PathVariable("id")int id)
	{
		ser.delete(id);
		return "student with ID"+id+"is deleted";
	}
	@PutMapping("/studput")
	public model updatestud(@RequestBody model m)
	{
		return ser.updatestud(m);
	}
	//delete mapping with requestParam
	@DeleteMapping("/reqparam")
	public String removeByreq(@RequestParam("id")int id)
	{
		ser.delete(id);
		return "Student with ID "+id+" is deleted"	;
    }
	//delete mapping with present or not
	@DeleteMapping("/deletebyuserid")
	public ResponseEntity<String>deletehotelinfo(@PathVariable int id)
	{
		boolean deleted=ser.deletehotelinfo(id);
		if(deleted)
		{
			return ResponseEntity.ok("student with ID"+id+"deleted");
		}
		else 
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("student with ID "+id+" not found");
		}
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<?>getUserId(@PathVariable int id)
	{
		Optional<model>student=ser.getUserId(id);
		if(student!=null)
		{
			return ResponseEntity.ok(student);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USer  not avavilable");
	}
}
