package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Expenses;

public interface ExpensesService {
	Expenses insertrecord(Expenses r);
    List<Expenses> getAll();
    void del(int ri);
    Expenses updaterecord( int i,Expenses r);

}
