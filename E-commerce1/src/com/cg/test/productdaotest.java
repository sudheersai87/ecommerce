package com.cg.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.exception.ProductException;
import com.cg.exception.ValidateException;
import com.cg.service.Service;
import com.cg.service.Serviceimpl;


public class productdaotest {
	
	static ProductDao prod;
	
	@BeforeAll
	public static void beforeAll() {
		prod = new ProductDaoImpl();
	}
	@Test	 
	public void testsearch1(){ 
		assertThrows(ProductException .class,()->prod.searchByProductName("1005"));

	}
	@Test	
	public void testsearch2() {
		assertThrows(ProductException.class,()->prod.searchByProductName("lava "));
	}
	@Test	
	public void testsearch3() {
		assertThrows(ProductException.class,()->prod.searchByProductName("lava"));
	}
	
	}