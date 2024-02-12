package com.javaexample.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class LoanRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User user;
	private double requestedAmount;
	private Integer tenure;
	private Double roi;
	private boolean approved;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Double getRoi() {
		return roi;
	}
	public void setRoi(Double roi) {
		this.roi = roi;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	

}
