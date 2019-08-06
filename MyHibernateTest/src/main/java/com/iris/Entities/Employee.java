package com.iris.Entities;

import java.util.List;

import javax.persistence.*;



@Entity
public class Employee {
	
	@Id
	private String email;
	@Column(name="fullname")
	private String name;
	private int age;
	
	//@ElementCollection
	//@JoinTable(name="Employee_Address",joinColumns=@JoinColumn(name="EmailId"))
	//@OneToMany(fetch=FetchType.EAGER)								
	//private List<Address> addr;
	
	@OneToOne(mappedBy="e",cascade=CascadeType.ALL)
	private Departments d;
	 
	public Employee() {}
	
	
	public Employee(String email, String name, int age) {
		
		this.email = email;
		this.name = name;
		this.age = age;
		
		//this.addr = addr;
	}


	public Departments getD() {
		return d;
	}


	public void setD(Departments d) {
		this.d = d;
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
	/*public List<Address> getAddr() {
		return addr;
	}
	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}*/

	
	

}
