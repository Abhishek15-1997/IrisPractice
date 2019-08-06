package com.iris.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String locality;
	private String city;
	private String state;
	private int houseNo;
	
	public Address() {}
	
	public Address(String locality, String city, String state, int houseNo) {
		
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.houseNo = houseNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	

}
