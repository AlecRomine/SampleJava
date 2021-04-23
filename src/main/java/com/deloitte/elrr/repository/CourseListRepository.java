package com.deloitte.elrr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.elrr.entity.CourseList;

@Repository
public interface CourseListRepository extends JpaRepository<CourseList, Long>{

}