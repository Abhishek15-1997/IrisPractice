package com.iris.Daos;

import java.util.List;

import com.iris.Entities.Customer;

public interface CustomerDao {
	public boolean addCustomer(Customer c);
	public Customer getCust(String email);
	public List<Customer> getAllCust();
	

}
