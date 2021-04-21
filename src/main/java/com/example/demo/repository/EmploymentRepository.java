package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employment;

public interface EmploymentRepository  extends JpaRepository<Employment, Long>{

}
