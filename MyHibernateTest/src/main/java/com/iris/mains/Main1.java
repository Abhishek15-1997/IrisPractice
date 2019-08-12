package com.iris.mains;

import com.iris.Daos.DepartmentDao;
import com.iris.Daos.EmployeeDao;
import com.iris.DaosImpl.DepartmentImpl;
import com.iris.DaosImpl.EmployeeImpl;
import com.iris.Entities.*;
import java.util.*;
public class Main1 {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		//Set<Employee> st=new HashSet<Employee>();
		/*DepartmentImpl dl=new DepartmentImpl();
		EmployeeImpl empl=new EmployeeImpl();
		
		Departments d=new Departments("IT");
		dl.addDepartment(d);
		Employee emp1=new Employee("abhishek@gmail.com","abhishek",22,d);
		Employee emp2=new Employee("ashish@gmail.com","ashish",22,d);
		empl.addEmployee(emp1);
		empl.addEmployee(emp2);*/
		
		Set<Employee> st=new HashSet<Employee>();
		DepartmentImpl dl=new DepartmentImpl();
		Employee emp1=new Employee("abhishek@gmail.com","abhishek",22);
		Employee emp2=new Employee("ashish@gmail.com","ashish",22);
		st.add(emp1);
		st.add(emp2);
		Departments d=new Departments(1,"IT",st);
		dl.addDepartment(d);
		
		
		


		
		
		
		
	}
	
}
