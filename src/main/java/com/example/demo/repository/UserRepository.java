package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CourseList;
import com.example.demo.entity.Personal;
import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<CourseList, Long>{

}