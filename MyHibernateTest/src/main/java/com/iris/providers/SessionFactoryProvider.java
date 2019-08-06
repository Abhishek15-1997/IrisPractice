package com.iris.providers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	
	private static SessionFactory sf=null;
	
	static
	{
		Configuration c=new Configuration();
		c.configure();
		sf=c.buildSessionFactory();
		
	}
	
	public static SessionFactory getSF()
	{
		return sf;
	}
	
	

}
