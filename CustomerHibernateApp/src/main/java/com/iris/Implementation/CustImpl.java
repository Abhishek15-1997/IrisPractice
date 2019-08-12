package com.iris.Implementation;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iris.Daos.CustomerDao;
import com.iris.Entities.Customer;
import com.iris.SessionProvider.SessionFact_Provider;

public class CustImpl implements CustomerDao{

	public boolean addCustomer(Customer c) {
		
		try {
		SessionFactory sf=SessionFact_Provider.getSF();
		Session s=sf.openSession();
		Transaction tts=s.beginTransaction();
		s.save(c);
		tts.commit();
		return true;
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

	public Customer getCust(String email) {
		try {
		SessionFactory sf=SessionFact_Provider.getSF();
		Session s=sf.openSession();
		Customer c=s.get(Customer.class, email);
		if(c!=null)
			return c;
		}
		catch(Exception e) {e.printStackTrace();}
		
		return null;
	}

	public List<Customer> getAllCust() {
		try {
			SessionFactory sf=SessionFact_Provider.getSF();
			Session s=sf.openSession();
			Query q=s.createQuery("from Customer");
			List<Customer> c=q.getResultList();
			return c;
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}

}
