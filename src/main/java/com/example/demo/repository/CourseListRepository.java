package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CourseList;

@Repository
public interface CourseListRepository extends JpaRepository<CourseList, Long>{

}