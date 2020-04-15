package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.exception.ProductException;
import com.cg.exception.ValidateException;
import com.cg.service.Service;
import com.cg.service.Serviceimpl;

public class PriceServiceTest {

	static Service service;

	@BeforeAll
	public static void beforeAll() {
		service = new Serviceimpl();
	}
	@Test	
	public void testsearch1() {
		assertThrows(ProductException.class,()->service.searchByProductName(" "));
	}
	@Test	
	public void testsearch2() {
		assertThrows(ProductException.class,()->service.searchByProductName("0"));
	}
	@Test	
	public void testsearch3() {
		assertThrows(ProductException.class,()->service.searchByProductName("@"));
	}
	@Test	
	public void testsearch4() {
		assertThrows(ProductException.class,()->service.searchByProductName("-25000"));
	}
	
}
