package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Feedback;

public interface FeedbackService {

	Feedback insertrecord(Feedback r);
    List<Feedback> getAll();
    void del(int ri);
    Feedback updaterecord( int i,Feedback r);
}
