package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.ContactUs;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Registration;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.repository.ContactUsRepository;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.repository.RegistractionRepository;

@Service
public class ContactUsServiceImpl  implements ContactUsService{

	 @Autowired
	    @Qualifier("contRepo")
	    private ContactUsRepository contRepo;

	@Override
	public ContactUs insertrecord(ContactUs r) {
		
		return contRepo.save(r);
	}

	@Override
	public List<ContactUs> getAll() {
		// TODO Auto-generated method stub
		return contRepo.findAll();
	}

	@Override
	public void del(int ri) {
		contRepo.deleteById(ri);
	}

	@Override
	public ContactUs updaterecord(int i, ContactUs r) {
		Optional<ContactUs> opt=contRepo.findById(r.getContactid());
		if(opt.isPresent())
		{
			ContactUs rold=opt.get();
			rold.setEmail(r.getEmail());
			rold.setAddress(r.getAddress());
			rold.setPhoneno(r.getPhoneno());
			
			 return contRepo.save(rold);
		}
		return null;
	}
	}


