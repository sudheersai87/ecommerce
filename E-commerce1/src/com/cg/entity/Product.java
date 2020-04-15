package com.cg.entity;

import java.util.List;

public class Product {

	private int productID;
	private String productName;
	private String productInfo;
	private double productPrice;
	private Category category;
	


	public Product(int productID, String productName, String productInfo, double productPrice, Category  category) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productInfo = productInfo;
		this.productPrice = productPrice;
		this.category =  category;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category  category) {
		this.category =  category;
	}
	@Override
	public String toString() {

		return productName+" "+productPrice+" "+productInfo+""+category;
	}
	
}
