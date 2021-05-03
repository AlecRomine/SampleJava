package com.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elrr.dto.Personal;

public interface PersonalRepository  extends JpaRepository<Personal, Long>{

}
