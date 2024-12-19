package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Expenses;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.repository.ExpensesRepository;


@Service
public class ExpensesServiceImpl implements ExpensesService {
	 @Autowired
	 @Qualifier("expRepo")
	 private ExpensesRepository expRepo;

	@Override
	public Expenses insertrecord(Expenses r) {
	
		return expRepo.save(r);
	}

	@Override
	public List<Expenses> getAll() {
		return expRepo.findAll();
	}

	@Override
	public void del(int ri) {
		expRepo.deleteById((long) ri);
		
	}

	@Override
	public Expenses updaterecord(int i, Expenses r) {
		Optional<Expenses> opt=expRepo.findById(r.getId());
		if(opt.isPresent())
		{
			Expenses rold=opt.get();
			rold.setName(r.getName());
			rold.setAmmount(r.getAmmount());
			rold.setCategory(r.getCategory());
			rold.setDate(r.getDate());
			
			 return expRepo.save(rold);
		}
		return null;
	}
}
	 
	

