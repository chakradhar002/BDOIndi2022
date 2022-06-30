package corejava.com.demo.streamsjava8;

import java.util.ArrayList;
import java.util.List;

class Product{
	
	int id;
	String name;
	float price;
	
	public Product() {
		
		
	}
	
	
	public Product(int id, String name ,float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

}

public class WithoutStreamDemo {

	public static void main(String[] args) {
		
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1,"samsung",1000f));
		productlist.add(new Product(2,"iphone",9000f));
		productlist.add(new Product(1,"x",2000f));
		productlist.add(new Product(1,"y",7000f));
		
		List<Float> productpricelist = new ArrayList<Float>();
		
		for(Product p:productlist) {
			
			if(p.price<7000) {
				
				productpricelist.add(p.price);
			}
		}
		System.out.println(productpricelist);

	}

}
