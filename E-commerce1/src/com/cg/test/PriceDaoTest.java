package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.exception.ProductException;

public class PriceDaoTest {

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
	public void testsearch2(){ 
		assertThrows(ProductException .class,()->prod.searchByProductName("30000"));
	}
	@Test	 
	public void testsearch3(){ 
		assertThrows(ProductException .class,()->prod.searchByProductName("-15000"));
	}
	@Test	 
	public void testsearch4(){ 
		assertThrows(ProductException .class,()->prod.searchByProductName("#$2"));
	}
}
