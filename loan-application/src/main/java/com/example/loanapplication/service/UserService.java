package com.example.loanapplication.service;

import com.example.loanapplication.entity.Loan;
import com.example.loanapplication.entity.User;
import com.example.loanapplication.repository.LoanRepository;
import com.example.loanapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    LoanRepository loanRepository;

    public User applyLoan(User user) {
        loanRepository.save(user.getLoan());
        user = userRepository.save(user);
        return user;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
