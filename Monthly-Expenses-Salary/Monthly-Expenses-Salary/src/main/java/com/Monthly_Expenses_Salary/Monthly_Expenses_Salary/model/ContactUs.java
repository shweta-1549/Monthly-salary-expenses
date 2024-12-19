package com.Monthly_Expenses_Salary.Monthly_Expenses_Salary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactUs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Contactid;
	
	private String email,address,phoneno;
	public ContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactUs(String email, String address, String phoneno) {
		super();
		this.email = email;
		this.address = address;
	
		this.phoneno = phoneno;
	}
	public int getContactid() {
		return Contactid;
	}
	public void setContactid(int contactid) {
		Contactid = contactid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "ContactUs [Contactid=" + Contactid + ", email=" + email + ", address=" + address + ", website="
		 + ", phoneno=" + phoneno + "]";
	}

     
}
