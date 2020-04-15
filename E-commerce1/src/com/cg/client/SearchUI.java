package com.cg.client;

import java.util.List;
import java.util.Scanner;

import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.entity.Category;
import com.cg.entity.Product;
import com.cg.exception.ProductException;
import com.cg.exception.ValidateException;
import com.cg.service.Service;
import com.cg.service.Serviceimpl;

public class SearchUI {

	public static void main(String[] args)  {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the product name");
		String obj=scan.nextLine();
		Service ser = new Serviceimpl();
		List<Product> ls;
		try {
			ls= ser.searchByProductName(obj);
			System.out.println(ls);

		} catch (ProductException | ValidateException e) {
			System.out.println(e.getMessage());;
		} 
	
		List<Product> ls1;
		ProductDao da=new ProductDaoImpl();
		double obj1=scan.nextDouble();

		try {
			ls1=ser.searchByProductPrice(obj1);
			System.out.println(ls1);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}
}
