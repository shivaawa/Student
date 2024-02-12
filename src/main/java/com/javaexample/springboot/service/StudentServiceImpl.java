package com.javaexample.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexample.springboot.Course;
import com.javaexample.springboot.Student;
import com.javaexample.springboot.StudentDetail;
import com.javaexample.springboot.repository.CourseRepository;
import com.javaexample.springboot.repository.StudentDetailRepository;
import com.javaexample.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	  @Autowired
	    private StudentRepository studentRepository;

	    @Autowired
	    private StudentDetailRepository studentDetailRepository;

	    @Autowired
	    private CourseRepository courseRepository;

	    // CRUD operations for Student

	    public Student createStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Optional<Student> getStudentById(Integer id) {
	        return studentRepository.findById(id);
	    }

	    public Student updateStudent(Integer id, Student updatedStudent) {
	        if (studentRepository.existsById(id)) {
	            updatedStudent.setId(id);
	            return studentRepository.save(updatedStudent);
	        }
	        return null;
	    }

	    public void deleteStudent(Integer id) {
	        studentRepository.deleteById(id);
	    }

	   
	    public StudentDetail createStudentDetail(Integer studentId, StudentDetail studentDetail) {
	        Optional<Student> optionalStudent = studentRepository.findById(studentId);
	        if (optionalStudent.isPresent()) {
	            studentDetail.setStudent(optionalStudent.get());
	            return studentDetailRepository.save(studentDetail);
	        }
	        return null;
	    }

	    public Optional<StudentDetail> getStudentDetailByStudentId(Integer studentId) {
	        return studentDetailRepository.findByStudentId(studentId);
	    }

	    // CRUD operations for Course

	    public Course enrollStudentInCourse(Integer studentId, Course course) {
	        Optional<Student> optionalStudent = studentRepository.findById(studentId);
	        if (optionalStudent.isPresent()) {
	            course.setStudent(optionalStudent.get());
	            return courseRepository.save(course);
	        }
	        return null; // Handle not found case
	    }

	    public List<Course> getCoursesByStudentId(Integer studentId) {
	        return courseRepository.findByStudentId(studentId);
	    }

	    // 
	}