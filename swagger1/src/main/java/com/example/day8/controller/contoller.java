package com.example.day8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8.model.model;
import com.example.day8.service.service;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class contoller {

	@Autowired
	public service ser;
	
	@PostMapping("/post")
	@Tag(name="Add user",description="Add user to database")
	public model savedet(@RequestBody model m)
	{
		return ser.saveDetails(m);
	}
	
	@GetMapping("/get")

	@Tag(name="get user",description="get user to database")
	public List<model> savedet()
	{
		return ser.getDetails();
	}
	
	@PutMapping("/put")
	public model update(@RequestBody model m)
	{
		return ser.update(m);
	}
	
}
