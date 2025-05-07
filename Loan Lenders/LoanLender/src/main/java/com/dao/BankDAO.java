package com.dao;

import com.bean.Customer;
import com.bean.Loan;
import com.repository.CustomerRepository;
import com.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankDAO {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private LoanRepository loanRepository;

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void allocateLoanToCustomer(long customerId, Loan loan) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));
        loan.setCustomer(customer);
        loanRepository.save(loan);
    }

    public List<Loan> loanWithMaxDueMinYears() {
        return loanRepository.findLoanWithMaxDueMinYears();
    }
}
