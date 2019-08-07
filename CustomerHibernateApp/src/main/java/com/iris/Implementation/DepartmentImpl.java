package com.iris.Implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.Daos.DepartmentDaos;
import com.iris.Entities.Departments;
import com.iris.SessionProvider.SessionFact_Provider;

public class DepartmentImpl implements DepartmentDaos{

	public boolean addDepartment(Departments d) {
		try {
			SessionFactory sf=SessionFact_Provider.getSF();
			Session s=sf.openSession();
			Transaction tts=s.beginTransaction();
			s.save(d);
			tts.commit();
			return true;
			}
			catch(Exception e) {e.printStackTrace();}
			
			return false;
		}
	
}
