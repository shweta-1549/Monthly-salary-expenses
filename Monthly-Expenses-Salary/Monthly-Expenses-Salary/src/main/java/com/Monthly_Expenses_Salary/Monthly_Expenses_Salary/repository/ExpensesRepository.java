package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Expenses;

@Repository
@Qualifier("expRepo")
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

}
