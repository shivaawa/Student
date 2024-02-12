package com.javaexample.springboot.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexample.springboot.StudentDetail;
@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Integer> {

	Optional<StudentDetail> findByStudentId(Integer studentId);

	StudentDetail save(StudentDetail studentDetail);

	

}
