package com.iris.SessionProvider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFact_Provider {
	
	private static SessionFactory sf=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSF()
	{
		return sf;
	}

}
