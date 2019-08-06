package com.iris.mains;

import com.iris.Daos.DepartmentDao;
import com.iris.Daos.EmployeeDao;
import com.iris.DaosImpl.DepartmentImpl;
import com.iris.DaosImpl.EmployeeImpl;
import com.iris.Entities.*;
import java.util.*;
public class Main1 {
	
	public static void main(String args[])
	{
		
		/*Address ad1=new Address("shibpur","howrah","WB",201);
		Address ad2=new Address("Behala","Kolkata","WB",106);

		List<Address> list=new ArrayList<Address>();
		list.add(ad1);
		list.add(ad2);
		Employee e=new Employee("abhishek@gmail.com","abhishek",22,list);
		
		EmployeeDao ed=new EmployeeImpl();
		if(ed.addEmployee(e))
			System.out.println("added");
		else
			System.out.println("Not added");
		*/
		EmployeeDao ed=new EmployeeImpl();
		Employee emp=new Employee("abhishek@gmail.com","abhishek",22);
		
		Departments d=new Departments("cse");
		DepartmentDao dd=new DepartmentImpl();
		
		emp.setD(d);
		d.setE(emp);
		
		//dd.addDepartment(d);
		ed.addEmployee(emp);
		
		
	}
	
}
