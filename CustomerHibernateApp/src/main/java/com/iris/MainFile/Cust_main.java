package com.iris.MainFile;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

import com.iris.Entities.Address;
import com.iris.Entities.Customer;
import com.iris.Entities.Departments;
import com.iris.Implementation.CustImpl;
import com.iris.Implementation.DepartmentImpl;

public class Cust_main {
	public static void main(String args[])
	{
			
		Departments d=new Departments("IT");
		DepartmentImpl p=new DepartmentImpl();
		p.addDepartment(d);
		
		Customer cst=new Customer("abhishek@gmail.com",22,"9874056987","abhishek",d);
		
		CustImpl c=new CustImpl();
		c.addCustomer(cst);
		
		
		
		
	
		
	}

}
