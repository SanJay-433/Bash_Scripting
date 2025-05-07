package com.bean;

import jakarta.persistence.*;

@Entity
public class Loan {
    @Id
    private long loanNumber;
    private String loanType;
    private double loanAmount;
    private int repaymentYears;
    private double monthlyDue;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Getters and Setters
    public long getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(long loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getRepaymentYears() {
        return repaymentYears;
    }

    public void setRepaymentYears(int repaymentYears) {
        this.repaymentYears = repaymentYears;
    }

    public double getMonthlyDue() {
        return monthlyDue;
    }

    public void setMonthlyDue(double monthlyDue) {
        this.monthlyDue = monthlyDue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
