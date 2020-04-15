package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.exception.ValidateException;
import com.cg.service.Service;
import com.cg.service.Serviceimpl;

public class ProductServiceTest {

	
	static Service service;

	@BeforeAll
	public static void beforeAll() {
		service = new Serviceimpl();
	}
	@Test	
	public void testsearch1() {
		assertThrows(ValidateException.class,()->service.searchByProductName(" "));
	}
	@Test	
	public void testsearch2() {
		assertThrows(ValidateException.class,()->service.searchByProductName("415"));
	}
	@Test	
	public void testsearch3() {
		assertThrows(ValidateException.class,()->service.searchByProductName("@"));
	}
	@Test	
	public void testsearch4() {
		assertThrows(ValidateException.class,()->service.searchByProductName("//."));
	}
	
}
