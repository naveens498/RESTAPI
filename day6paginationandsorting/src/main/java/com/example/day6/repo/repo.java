package com.example.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.model;

public interface repo extends JpaRepository<model, Integer>{

}
