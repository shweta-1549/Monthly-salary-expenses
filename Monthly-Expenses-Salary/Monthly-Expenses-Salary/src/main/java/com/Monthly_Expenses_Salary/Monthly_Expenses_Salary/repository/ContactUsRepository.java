package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.ContactUs;

@Repository
@Qualifier("contRepo")
public interface ContactUsRepository extends JpaRepository<ContactUs,Integer> {

}
