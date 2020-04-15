package com.cg.service;

import java.util.List;

import com.cg.entity.Category;
import com.cg.entity.Product;
import com.cg.exception.ProductException;
import com.cg.exception.ValidateException;

public interface Service {
	List<Product> searchByProductName(String pname) throws ProductException, ValidateException;

	  List<Product> searchByProductPrice(double price) throws ProductException;

	 


}
