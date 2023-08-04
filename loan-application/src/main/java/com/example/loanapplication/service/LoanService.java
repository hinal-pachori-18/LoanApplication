package com.example.loanapplication.service;

import com.example.loanapplication.entity.Loan;
import com.example.loanapplication.entity.User;
import com.example.loanapplication.repository.LoanRepository;
import com.example.loanapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    UserRepository userRepository;

    public Loan approvedLoan(Long userId)
    {
        User user = userRepository.findById(userId).get();
        Loan loan = user.getLoan();
        loan.setApproved(true);
        loan.setWeeklyPaymentDate(LocalDate.now().plusDays(7));
        Loan updatedLoan = loanRepository.save(loan);
        return updatedLoan;
    }

    public Loan updateWeeklyPayment(Long userId,Double weeklyPayment)
    {
        User user = userRepository.findById(userId).get();
         Loan loan = user.getLoan();
         loan.setWeeklyPayment(weeklyPayment);
         loan.setWeeklyPaymentDate(LocalDate.now().plusDays(7));
         Loan savePayment = loanRepository.save(loan);
        return savePayment;
    }
}
