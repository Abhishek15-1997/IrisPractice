package com.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private String ProductId;
	private String ProductName;
	private String Pdes;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Category cat;
	public String getPdes() {
		return Pdes;
	}

	public void setPdes(String pdes) {
		Pdes = pdes;
	}

	

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}
	
	

}