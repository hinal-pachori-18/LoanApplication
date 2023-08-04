package com.example.loanapplication.controller;

import com.example.loanapplication.entity.Loan;
import com.example.loanapplication.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/loan")

public class LoanController {

    @Autowired
    LoanService loanService;

    @PutMapping("/{userId}")
    public ResponseEntity<Loan> approvedLoan(@PathVariable Long userId){
         Loan loan = loanService.approvedLoan(userId);
         return new ResponseEntity<>(loan, HttpStatus.OK);
    }
    @PutMapping("/payment/{userId}")
    public ResponseEntity<Loan> updatePayment(@PathVariable Long userId, @RequestParam Double payment)
    {
         Loan loan = loanService.updateWeeklyPayment(userId, payment);
         return new ResponseEntity<>(loan,HttpStatus.OK);
    }
}
