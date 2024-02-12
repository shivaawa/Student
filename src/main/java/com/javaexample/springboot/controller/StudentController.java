package com.javaexample.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexample.springboot.Course;
import com.javaexample.springboot.Student;
import com.javaexample.springboot.StudentDetail;
import com.javaexample.springboot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	  @Autowired
	    private StudentService studentService;

	    @PostMapping("/student")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.createStudent(student);
	    }

	    @GetMapping("/student")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Optional<Student> getStudentById(@PathVariable Integer id) {
	        return studentService.getStudentById(id);
	    }

	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable Integer id, @RequestBody Student updatedStudent) {
	        return studentService.updateStudent(id, updatedStudent);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Integer id) {
	        studentService.deleteStudent(id);
	    }


	    @PostMapping("/{studentId}/student-detail")
	    public StudentDetail createStudentDetail(@PathVariable Integer studentId, @RequestBody StudentDetail studentDetail) {
	        return studentService.createStudentDetail(studentId, studentDetail);
	    }

	    @GetMapping("/{studentId}/student-detail")
	    public Optional<StudentDetail> getStudentDetailByStudentId(@PathVariable Integer studentId) {
	        return studentService.getStudentDetailByStudentId(studentId);
	    }

	    @PostMapping("/{studentId}/courses")
	    public Course enrollStudentInCourse(@PathVariable Integer studentId, @RequestBody Course course) {
	        return studentService.enrollStudentInCourse(studentId, course);
	    }

	    @GetMapping("/{studentId}/courses")
	    public List<Course> getCoursesByStudentId(@PathVariable Integer studentId) {
	        return studentService.getCoursesByStudentId(studentId);
	    }

	    
	}