package com.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elrr.dto.Organization;

public interface OrganizationRepository  extends JpaRepository<Organization, Long>{

}
