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

	

}
