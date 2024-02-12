package com.javaexample.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexample.springboot.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	List<Course> findByStudentId(Integer studentId);

}
