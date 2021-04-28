package com.deloitte.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.elrr.entity.Organization;

public interface OrganizationRepository  extends JpaRepository<Organization, Long>{

}
