package com.cg.entity;

public class Category {

	private String categoryname;
	private String categoryId;
	
	public Category(String categoryname, String categoryId) {
		super();
		this.categoryname = categoryname;
		this.categoryId = categoryId;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {

		return  categoryname;

	}
	
}
