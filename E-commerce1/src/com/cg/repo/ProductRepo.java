package com.cg.repo;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Category;
import com.cg.entity.Product;

public class ProductRepo {

	public static List<Product> lst=new ArrayList<Product>();
	public static List<Category> lst1=new ArrayList<Category>() ;
	static {



		Category cat=new Category("mobilephone ", "M ");
		Category cat1=new Category("Laptops", "L");

		Category cat2=new Category("Acessories", "A");

		lst1.add(cat);
		lst1.add(cat1);
		lst1.add(cat2);



		Product prod=new Product(1,"Samsung M30","64gb,6gb rom ",17000,cat);
		Product prod1=new Product(2,"Lenovo", "64gb,6gb rom ", 16000, cat);
		Product prod2=new Product(3,"Vivo", "64gb,6gb rom ", 17000,cat);
		Product prod3=new Product(4,"Oneplus", "64gb,6gb rom ", 17000,cat);
		Product prod4=new Product(5,"Oppo", "64gb,6gb rom ", 17000,cat);
		Product prod5=new Product(6,"Nokia lumia", "64gb,6gb rom ", 17000,cat);
		Product prod6=new Product(7,"Vivo ms", "64gb,6gb rom ", 17000,cat); 
		Product prod7=new Product(8," Hp Pavilion", "1TB, 8gbram ", 35000,cat1); 
		Product prod8=new Product(9," Dell Insprion", "2TB,8gb ram ", 65000,cat1); 
		Product prod9=new Product(10," Lenovo ", "1TB,4gb ram ", 30000,cat1); 
		Product prod10=new Product(11," Acer ", "1TB ,6gb ram ", 340000,cat1); 
		Product prod11=new Product(12," JBL earphones ", "5.56mmjack, wireless ", 1700,cat2); 
		Product prod12=new Product(13," OneplusBullets", "wireless,fastcharging ", 4000,cat2); 
		Product prod13=new Product(14," bullets ", " wireless,fastcharging ", 1000,cat2);

		lst.add(prod);
		lst.add(prod1);
		lst.add(prod2);
		lst.add(prod3);
		lst.add(prod4);
		lst.add(prod5);
		lst.add(prod6);
		lst.add(prod7);

	}
}
