package com.cg.service;

import java.util.List;


import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.entity.Category;
import com.cg.entity.Product;
import com.cg.exception.ProductException;
import com.cg.exception.ValidateException;

public class Serviceimpl  implements Service{
	ProductDao dao = new ProductDaoImpl();
	@Override
	public List<Product> searchByProductName(String pname) throws ProductException, ValidateException {
		if(!pname.matches("[A-Za-z]+"))
			throw new ValidateException("enter valid details"); 
		return dao.searchByProductName(pname);
	}
	@Override
	public List<Product> searchByProductPrice(double price) throws ProductException {

		return dao.searchByProductPrice(price);
	} 

}
