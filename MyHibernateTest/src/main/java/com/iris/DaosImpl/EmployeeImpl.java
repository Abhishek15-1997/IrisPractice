package com.iris.DaosImpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.Daos.EmployeeDao;
import com.iris.Entities.Employee;
import com.iris.providers.SessionFactoryProvider;

public class EmployeeImpl implements EmployeeDao{

	public boolean addEmployee(Employee e) {
		try
		{
			Session s=SessionFactoryProvider.getSF().openSession();
			Transaction tts=s.beginTransaction();
			s.save(e);
			tts.commit();
			return true;
		}
		catch(Exception e1) {e1.printStackTrace();}
		return false;
	}

	public Employee getEmployee(String email) {
		try
		{
			Session s=SessionFactoryProvider.getSF().openSession();
			Employee emp=s.get(Employee.class, email);
			if(emp!=null)
				return emp;
		}
		catch(Exception e1) {e1.printStackTrace();}
		return null;
	}

	public List<Employee> getAllEmployee() {
		try
		{
			Session s=SessionFactoryProvider.getSF().openSession();
			Query q=s.createQuery("from Employee");
			List<Employee>list=q.getResultList();
			return list;
		}
		catch(Exception e1) {e1.printStackTrace();}
		return null;
	}
	

}
