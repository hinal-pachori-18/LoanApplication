package com.example.loanapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")
public class User {
    @Id
    private Long userId;
    private String userName;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Loan loan;
}
