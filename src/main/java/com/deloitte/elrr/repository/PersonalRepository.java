package com.deloitte.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.elrr.entity.Personal;

public interface PersonalRepository  extends JpaRepository<Personal, Long>{

}
