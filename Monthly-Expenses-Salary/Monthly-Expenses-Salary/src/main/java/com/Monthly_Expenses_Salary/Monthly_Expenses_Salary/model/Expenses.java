package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expenses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;;
	private double ammount;
	private String category;
	private LocalDate date=LocalDate.now();
	
	public Expenses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expenses(String name, double ammount, String category, LocalDate date) {
		super();
		this.name = name;
		this.ammount = ammount;
		this.category = category;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Expenses [id=" + id + ", name=" + name + ", ammount=" + ammount + ", category=" + category + ", date="
				+ date + "]";
	}
	
	
	

}
