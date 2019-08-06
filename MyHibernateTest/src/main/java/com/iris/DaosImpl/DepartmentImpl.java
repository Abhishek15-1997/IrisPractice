package com.iris.DaosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.Daos.DepartmentDao;
import com.iris.Entities.Departments;
import com.iris.Entities.Employee;
import com.iris.providers.SessionFactoryProvider;

public class DepartmentImpl implements DepartmentDao{

	public boolean addDepartment(Departments e) {
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
	

	public Departments getDepartment(int id) {
		try
		{
			Session s=SessionFactoryProvider.getSF().openSession();
			Departments emp=s.get(Departments.class, id);
			if(emp!=null)
				return emp;
		}
		catch(Exception e1) {e1.printStackTrace();}
		return null;
	}
	

	public List<Departments> getAllDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
