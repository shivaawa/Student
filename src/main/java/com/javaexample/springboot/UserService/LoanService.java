package com.javaexample.springboot.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexample.springboot.Entity.Loan;
import com.javaexample.springboot.UserRepository.LoanRepository;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public Double calculateEMI(Double loanAmount, Integer tenure, Double roi) {
        double monthlyInterestRate = roi / (12 * 100);
        double emi = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -tenure));
        return emi;
    }

    public void payEMI(Loan loan, Double emiAmount) {
        double newOutstandingAmount = loan.getOutstandingAmount() - emiAmount;
        loan.setOutstandingAmount(newOutstandingAmount);
        loanRepository.save(loan);
    }
}

