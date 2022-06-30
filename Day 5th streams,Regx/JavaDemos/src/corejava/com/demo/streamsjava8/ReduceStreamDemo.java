package corejava.com.demo.streamsjava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/*
 * 
 this method takes a sequence of input elements and combines them into a single summary result by 
 repeated operation. For example, finding the sum of numbers, or accumulating elements into a list.

In the following example, we are using reduce() method, which is used to sum of all the product prices.
 */

class Product3 {

	int id;
	String name;
	float price;

	public Product3() {

	}

	public Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}


public class ReduceStreamDemo {

	public static void main(String[] args) {
		List<Product3> productlist = new ArrayList<Product3>();
		productlist.add(new Product3(1, "samsung", 1000f));
		productlist.add(new Product3(2, "iphone", 9000f));
		productlist.add(new Product3(3, "x", 2000f));
		productlist.add(new Product3(4, "y", 7000f));
		
		Float totalprice  = productlist.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
		//System.out.println(totalprice);
		
		Comparator<Product3> c =Comparator.comparing(Product3::getPrice);
		//max
		Product3 p = productlist.stream().max(c).get();
		System.out.println(p.price);
	

	}

}
