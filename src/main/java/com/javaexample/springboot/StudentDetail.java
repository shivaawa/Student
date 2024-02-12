package com.javaexample.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class StudentDetail  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String additionalInfo;

    @OneToOne(mappedBy = "studentDetail")
    private Student student;

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public void setStudent(Student student2) {
		// TODO Auto-generated method stub
		
	}

}
