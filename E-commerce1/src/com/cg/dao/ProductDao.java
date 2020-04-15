package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Category;
import com.cg.entity.Product;
import com.cg.exception.ProductException;

public interface ProductDao {

	List<Product> searchByProductName(String pname) throws ProductException;

	
	  List<Product> searchByProductPrice(double price) throws ProductException;
	 	

	
	}
