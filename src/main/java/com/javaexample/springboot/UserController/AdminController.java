package com.javaexample.springboot.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexample.springboot.Entity.LoanRequest;
import com.javaexample.springboot.UserService.LoanRequestService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private LoanRequestService loanRequestService;

    @GetMapping("/loan/requests")
    public ResponseEntity<List<LoanRequest>> getAllLoanRequests() {
        List<LoanRequest> loanRequests = loanRequestService.getAllLoanRequests();
        return ResponseEntity.ok(loanRequests);
    }

    @PostMapping("/loan/request/{requestId}/approve")
    public ResponseEntity<String> approveLoanRequest(@PathVariable Long requestId) {
        loanRequestService.approveLoanRequest(requestId);
        return ResponseEntity.ok("Loan request approved successfully.");
    }
    
}