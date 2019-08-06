package com.iris.MainFile;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

import com.iris.Entities.Address;
import com.iris.Entities.Customer;
import com.iris.Implementation.CustImpl;

public class Cust_main {
	public static void main(String args[])
	{
		//Add customer
		/*Address Paddr=new Address("Howrah","Shibpur",71123,"WB");
		Address Caddr=new Address("kolkata","Behala",71156,"WB");
		
		Customer cust=new Customer("Mayank@gmail.com",25,"987440141","Mayank",Caddr,Paddr);
		CustImpl c=new CustImpl();
		if(c.addCustomer(cust))
			System.out.println("added ");
		else
			System.out.println("not added");
		*/
		
		// Get Customer
		
		/*Customer c;
		
		CustImpl ci=new CustImpl();
		c=ci.getCust("abhishek@gmail.com");
		
		System.out.println(c.getName()+" "+c.getC_addr().getState()+" "+c.getP_addr().getState());
		*/
		
		//G   etAll Customer
		/*CustImpl ci=new CustImpl();
		List<Customer> c=ci.getAllCust();
		
		Iterator itr=c.listIterator();
		
		while(itr.hasNext())
		{
			Customer cst=(Customer)itr.next();
			System.out.println(cst.getName());
		}*/
		
		
		
		Address addr1=new Address("Howrah","Shibpur",71123,"WB");
		Address addr2=new Address("kolkata","Behala",71156,"WB");
		
		Set<Address> ad=new HashSet<Address>();
		ad.add(addr1);
		ad.add(addr2);
		
		Customer cust=new Customer("Mayank@gmail.com",25,"987440141","Mayank",ad);
		CustImpl ci=new CustImpl();
		ci.addCustomer(cust);
		
		
	}

}
