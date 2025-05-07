package com.bean;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    private long customerId;
    private String customerName;
    private long customerContactNumber;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Loan> loanList;

    // Getters and Setters
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerContactNumber() {
        return customerContactNumber;
    }

    public void setCustomerContactNumber(long customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }
}

