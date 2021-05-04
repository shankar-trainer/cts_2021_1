package com.spring.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.bo.Shop;

@Component
public class Product {
 	private String productId;
	private String productName; 
	private double mrpValue;
	private Shop shopDetails;
	private String dimension;
	
	@Autowired
	public Product(Shop shopDetails) {
		super();
		this.shopDetails = shopDetails;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getMrpValue() {
		return mrpValue;
	}
	public void setMrpValue(double mrpValue) {
		this.mrpValue = mrpValue;
	}
	public Shop getShopDetails() {
		return shopDetails;
	}
	public void setShopDetails(Shop shopDetails) {
		this.shopDetails = shopDetails;
	}
}
