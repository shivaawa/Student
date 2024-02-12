package com.javaexample.springboot;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    // OneToOne relationship with StudentDetail
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_detail_id", referencedColumnName = "id")
    private StudentDetail studentDetail;

    // ManyToOne relationship with Course
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // OneToMany relationship with Course
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Course> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id2) {
		// TODO Auto-generated method stub
		
	}



}