package com.Mains;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.Daos.CategoryDao;
import com.Daos.ProductDao;
import com.Daos.ProductImpl;

import com.Entities.*;


public class Main1 {
 	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		

		Category c=new Category();
		c.setCategoryName("Ball");
		c.setDes("all types of sports ball");
		//c.setPro(pro);
		
		Product p=new Product();
		p.setProductName("tennis ball");
		p.setPdes("green color");
		p.setCat(c);
		
		Product p1=new Product();
		p1.setProductName("duce ball");
		p1.setPdes("white");
		p1.setCat(c);
		
		
		 ProductDao pd=(ProductDao)context.getBean("productDaoImpl", ProductDao.class);
	//	CategoryDao cd=(CategoryDao)context.getBean("categoryDao", CategoryDao.class);
	        
		 
		System.out.println("hi");
		pd.addProduct(p);
		pd.addProduct(p1);
		//p.setCat(cat);
		
	}
	

}
