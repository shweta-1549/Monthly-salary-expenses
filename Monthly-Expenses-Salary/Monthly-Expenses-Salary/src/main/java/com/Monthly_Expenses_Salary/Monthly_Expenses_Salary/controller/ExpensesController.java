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

import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model.Expenses;
import com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.service.ExpensesService;


@RestController
public class ExpensesController {
	
	@Autowired
	
	private ExpensesService es;
	@GetMapping("/expenses")
	public List<Expenses> handleget()
	{
		return es.getAll();
	}
	
	@PostMapping("/addexp")
     public Expenses add (@RequestBody Expenses r)
     {
		return es.insertrecord(r);
     }
	@DeleteMapping("/delexp/{rid}")
	public void delr(@PathVariable("rid") int r )
	{
		es.del(r);
	}
	@PutMapping("/upexp/{rid}")
	public Expenses update(@PathVariable("rid")int i,@RequestBody Expenses r)
	{
		return es.updaterecord(i,r);
	}



}
