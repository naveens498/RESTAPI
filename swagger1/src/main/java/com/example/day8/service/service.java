package com.example.day8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8.model.model;
import com.example.day8.repo.repo;

@Service

public class service {

	@Autowired
	public repo rep;
	
	//post
	public model saveDetails(model m)
	{
		return rep.save(m);
	}
	
	//get
	public List<model> getDetails()
	{
		return rep.findAll();
	}
	
	//update
	public  model update(model m)
	{
		return rep.saveAndFlush(m);
	}
}
