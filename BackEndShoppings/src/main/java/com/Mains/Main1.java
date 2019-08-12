package com.Mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Daos.ProductDao;
import com.Daos.ProductImpl;
import com.Entities.Category;
import com.Entities.Product;

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
		
		 ProductDao pd=new ProductImpl();
		System.out.println("hi");
		pd.addProduct(p);
		//p.setCat(cat);
		
	}
	

}
