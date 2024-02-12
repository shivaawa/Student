package com.javaexample.springboot.service;

import java.util.List;
import java.util.Optional;

import com.javaexample.springboot.Course;
import com.javaexample.springboot.Student;
import com.javaexample.springboot.StudentDetail;

public interface StudentService {

	Student createStudent(Student student);

	List<Student> getAllStudents();

	Optional<Student> getStudentById(Integer id);

	Student updateStudent(Integer id, Student updatedStudent);

	void deleteStudent(Integer id);

	StudentDetail createStudentDetail(Integer studentId, StudentDetail studentDetail);

	Course enrollStudentInCourse(Integer studentId, Course course);

	Optional<StudentDetail> getStudentDetailByStudentId(Integer studentId);

	List<Course> getCoursesByStudentId(Integer studentId);


}
