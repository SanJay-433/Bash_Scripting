package com.repository;

import com.bean.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    @Query("SELECT l FROM Loan l WHERE l.monthlyDue = (SELECT MAX(l2.monthlyDue) FROM Loan l2) AND l.repaymentYears = (SELECT MIN(l2.repaymentYears) FROM Loan l2)")
    List<Loan> findLoanWithMaxDueMinYears();
}
