package com.Mains;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.Daos.ProductDao;
import com.Daos.ProductImpl;
import com.Entities.Category;
import com.Entities.Product;




class myclass2
{
	@Autowired
	 myclass mc;
	
	myclass2()
	{
		System.out.println("allk");
		System.out.println(mc.m1());
		
	}

	
}

@Component
class myclass
{
	public String m1()
	{
		return "hi";
	}
}

public class Main1 {
 
	
	public static void main(String args[])
	{
		myclass2 mc2=new myclass2();
		
		
		
		/*ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
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
		//p.setCat(cat);*/
		
	}
	

}
