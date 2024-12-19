package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.ContactUs;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Feedback;

public interface ContactUsService {
	ContactUs insertrecord(ContactUs r);
    List<ContactUs> getAll();
    void del(int ri);
    ContactUs updaterecord( int i,ContactUs r);

}
