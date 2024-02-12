package com.javaexample.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaexample.springboot.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
