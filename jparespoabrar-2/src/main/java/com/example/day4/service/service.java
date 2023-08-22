package com.example.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.day4.model.model;
import com.example.day4.repo.repo;

@Service

public class service {

	@Autowired
	public repo rep;
	
	
	//post
	public model saveDetailsModel(model m)
	{
		return rep.save(m);
	}
	
	//get
	public List<model> getDetails()
	{
		return rep.findAll();
	}
	
	//
	public void delete(int id)
	{
		System.out.println("Deleted");
		rep.deleteById(id);
	}
	public model updatestud(model m)
	{
		return rep.saveAndFlush(m);
	}
}
