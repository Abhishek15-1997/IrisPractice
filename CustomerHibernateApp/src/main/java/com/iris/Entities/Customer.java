package com.iris.Entities;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
public class Customer {
	
	@Id
	private String email;
	private int age;
	private String ctc_no;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Departments dept;
	
	public Customer() {}
	
	public Customer(String email, int age, String ctc_no, String name,Departments dept) {
		
		this.email = email;
		this.age = age;
		this.ctc_no = ctc_no;
		this.name = name;
		this.dept=dept;
	
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCtc_no() {
		return ctc_no;
	}


	public void setCtc_no(String ctc_no) {
		this.ctc_no = ctc_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Departments getDept() {
		return dept;
	}


	public void setDept(Departments dept) {
		this.dept = dept;
	}

	

	

	
}
