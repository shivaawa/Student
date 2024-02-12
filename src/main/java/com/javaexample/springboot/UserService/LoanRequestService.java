package com.javaexample.springboot.UserService;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexample.springboot.Entity.LoanRequest;
import com.javaexample.springboot.UserRepository.LoanRequestRepository;

@Service
public class LoanRequestService {
    @Autowired
    private LoanRequestRepository loanRequestRepository;

    public void raiseLoanRequest(LoanRequest loanRequest) {
        loanRequestRepository.save(loanRequest);
    }

    public List<LoanRequest> getAllLoanRequests() {
        return loanRequestRepository.findByApproved(false);
    }

    public void approveLoanRequest(Long requestId) {
        Optional<LoanRequest> optionalLoanRequest = loanRequestRepository.findById(requestId);
        if (optionalLoanRequest.isPresent()) {
            LoanRequest loanRequest = optionalLoanRequest.get();
            loanRequest.setApproved(true);
            loanRequestRepository.save(loanRequest);
        }
    }

	
}