package com.iris.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private String locality;
	private int pincode;
	private String state;
	
	public Address() {}
	

	public Address(String city, String locality, int pincode, String state) {
		super();
		this.city = city;
		this.locality = locality;
		this.pincode = pincode;
		this.state = state;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", locality=" + locality + ", pincode=" + pincode + ", state=" + state + "]";
	}
	

}
