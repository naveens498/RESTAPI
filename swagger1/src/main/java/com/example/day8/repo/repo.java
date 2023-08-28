package com.example.day8.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.model.model;


public interface repo extends JpaRepository<model, Integer>{

}
