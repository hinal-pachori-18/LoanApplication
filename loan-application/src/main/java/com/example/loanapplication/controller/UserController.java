package com.example.loanapplication.controller;

import com.example.loanapplication.entity.Loan;
import com.example.loanapplication.entity.User;
import com.example.loanapplication.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllLoanduserdetails()
    {
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users,HttpStatus.FOUND);
    }
    @PostMapping("/applyLoan")
    public ResponseEntity<User> applyLoan(@RequestBody User user)
    {
         User user1 = userService.applyLoan(user);
         return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
}
