package com.iris.Entities;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	private String email;
	@Column(name="fullname")
	private String name;
	private int age;
	
	
	@ManyToOne
	private Departments d;
	 
	public Employee() {}
	
	public Employee(String email, String name, int age) {
		
		this.email = email;
		this.name = name;
		this.age = age;
		
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public Departments getD() {
		return d;
	}



	public void setD(Departments d) {
		this.d = d;
	}



	

	
		

}
