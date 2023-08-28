package com.example.day8.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.model.student;

public interface studentrepo extends JpaRepository<student, Integer>{

}
