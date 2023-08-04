package com.example.loanapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Id
    private Long loanId;
    private Double amountRequired;
    private Integer loanTerm;

    private LocalDate weeklyPaymentDate;
    private Double weeklyPayment;
    private boolean approved;

}
