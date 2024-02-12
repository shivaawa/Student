package com.javaexample.springboot.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexample.springboot.Entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

}
