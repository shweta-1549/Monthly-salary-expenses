package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Registration;

public interface RegistrationService {
	Registration insertrecord(Registration r);
    List<Registration> getAll();
    void del(int ri);
    Registration updaterecord( int i,Registration r);
    List<Registration> login(String emailid,String password);
}
