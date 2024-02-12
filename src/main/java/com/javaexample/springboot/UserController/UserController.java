package com.javaexample.springboot.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaexample.springboot.Entity.LoanRequest;
import com.javaexample.springboot.UserService.LoanRequestService;
import com.javaexample.springboot.UserService.LoanService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private LoanRequestService loanRequestService;
    @Autowired
    private LoanService loanService;

    @PostMapping("/{userId}/loan/request")
    public ResponseEntity<String> raiseLoanRequest(@PathVariable Long userId, @RequestBody LoanRequest loanRequest) {
        loanRequestService.raiseLoanRequest(loanRequest);
        return ResponseEntity.ok("Loan request raised successfully.");
    }

    @GetMapping("/{userId}/loan/emi")
    public ResponseEntity<Double> calculateEMI(@PathVariable Long userId,
                                                @RequestParam Double loanAmount,
                                                @RequestParam Integer tenure,
                                                @RequestParam Double roi) {
      
        Double emi = loanService.calculateEMI(loanAmount, tenure, roi);
        return ResponseEntity.ok(emi);
    }

   
}

