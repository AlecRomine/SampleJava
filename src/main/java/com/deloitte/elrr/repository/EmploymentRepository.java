package com.deloitte.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.elrr.entity.Employment;

public interface EmploymentRepository  extends JpaRepository<Employment, Long>{

}
