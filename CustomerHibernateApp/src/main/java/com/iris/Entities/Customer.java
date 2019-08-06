package com.iris.Entities;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id
	private String email;
	private int age;
	private String ctc_no;
	private String name;
	
	/*@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="Current_city")),
		@AttributeOverride(name="locality", column=@Column(name="Current_locality")),
		@AttributeOverride(name="pincode", column=@Column(name="Current_pincode")),
		@AttributeOverride(name="state", column=@Column(name="Current_state"))
	})
	private Address C_addr;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="Permanent_city")),
		@AttributeOverride(name="locality", column=@Column(name="Permanent_locality")),
		@AttributeOverride(name="pincode", column=@Column(name="Permanent_pincode")),
		@AttributeOverride(name="state", column=@Column(name="Permanent_state"))
	})*/
	
	//private Address P_addr;
	
	@ElementCollection
	@JoinTable(name="Customer_Address",joinColumns=@JoinColumn(name="Email"))//To change the table name and foreign key name
	private Set<Address> ad;
	public Customer() {}
	
	
	public Customer(String email, int age, String ctc_no, String name,Set<Address> ad) {
		
		this.email = email;
		this.age = age;
		this.ctc_no = ctc_no;
		this.name = name;
		this.ad=ad;
	//	this.C_addr=C_addr;
		//this.P_addr=P_addr;
	}

	

	/*public Address getP_addr() {
		return P_addr;
	}


	public void setP_addr(Address p_addr) {
		P_addr = p_addr;
	}


	public Address getC_addr() {
		return C_addr;
	}


	public void setC_addr(Address c_addr) {
		C_addr = c_addr;
	}*/


	public Set<Address> getAd() {
		return ad;
	}


	public void setAd(Set<Address> ad) {
		this.ad = ad;
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
	
}
