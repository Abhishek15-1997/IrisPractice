package com.iris.Entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departments {
	
	@Id
	
	private int d_id;
	private String d_name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Employee> emp;
	public Departments() {}

	public Departments(int di, String d_name,Set<Employee> emp) {
		this.d_name = d_name;
		this.emp=emp;
		d_id=di;
		
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	
}
