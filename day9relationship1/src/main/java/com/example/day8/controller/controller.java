package com.example.day8.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.day8.model.student;
import com.example.day8.repo.studentrepo;

@RestController
@RequestMapping("/student")
public class controller {
	
	@Autowired
    public studentrepo repo;
    
    @PostMapping("/studentDet")
    public student get(@RequestBody student st)
	{
		return repo.save(st);
	}
	@GetMapping
	public List<student> getDetails()
	{
		return repo.findAll();
		}
	
}
