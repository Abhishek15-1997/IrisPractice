package com.iris.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departments {
	
	@Id
	@GeneratedValue
	private int d_id;
	private String dept_name;
	
	@OneToOne
	private Employee e;
	
	public Departments() {}
	
	public Departments( String dept_name) {
		
		
		this.dept_name = dept_name;
		
	}

	
	public Employee getE() {
		return e;
	}



	public void setE(Employee e) {
		this.e = e;
	}



	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	

}
