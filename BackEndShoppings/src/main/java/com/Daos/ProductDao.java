package com.Daos;

import java.util.List;

import com.Entities.Product;

public interface ProductDao {

	public boolean addProduct(Product c);
	public List<Product> viewAllProuct();
	public boolean delProduct(Product c);
	public boolean updateProduct(Product c);
}