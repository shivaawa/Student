package com.javaexample.springboot.UserRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexample.springboot.Entity.LoanRequest;

@Repository
public interface LoanRequestRepository extends JpaRepository<LoanRequest, Long> {

	List<LoanRequest> findByApproved(boolean b);
	

}
