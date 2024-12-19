package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.ContactUs;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service.ContactUsService;



@RestController
public class ContactUsController {
	@Autowired
	
	private ContactUsService cs;
	@GetMapping("/contact")
	public List<ContactUs> handleget()
	{
		return cs.getAll();
	}
	
	@PostMapping("/addcont")
     public ContactUs add (@RequestBody ContactUs r)
     {
		return cs.insertrecord(r);
     }
	@DeleteMapping("/delcont/{rid}")
	public void delr(@PathVariable("rid") int r )
	{
		cs.del(r);
	}
	@PutMapping("/upcont/{rid}")
	public ContactUs update(@PathVariable("rid")int i,@RequestBody ContactUs r)
	{
		return cs.updaterecord(i,r);
	}


}
