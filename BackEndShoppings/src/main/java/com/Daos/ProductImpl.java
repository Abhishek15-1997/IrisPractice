package com.Daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DBConfig.DBconfig;
import com.Daos.ProductDao;
import com.Entities.Category;
import com.Entities.Product;

@Repository(value="productDaoImpl")
@Transactional
public class ProductImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;
	
	public boolean addProduct(Product c) {	
		try {
			
			System.out.println("......lkjh");
			
			
			Session s=sf.getCurrentSession();
			System.out.println("......");
			//Transaction t=session.beginTransaction();
			s.save(c);
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

	

	public boolean delProduct(Product c) {

		try {
			Session session=sf.getCurrentSession();
			Category cat=session.get(Category.class, c.getProductId());
			if(cat!=null)
			{
				session.delete(c);
				return true;
			}
			}
			catch(Exception e) {e.printStackTrace();}
		return false;
	}

	public boolean updateProduct(Product c) {
		try {
			Session session=sf.getCurrentSession();
			Category cat=session.get(Category.class, c.getProductId());
			if(cat!=null)
			{
				session.update(c);
				return true;
			}
					
		}
		catch(Exception e) {e.printStackTrace();}
		return false;
	}



	public List<Product> viewAllProuct() {
		try {
			Session session=sf.getCurrentSession();
			Query q=session.createQuery("from Category");
			return q.getResultList();
			
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}



	
}
