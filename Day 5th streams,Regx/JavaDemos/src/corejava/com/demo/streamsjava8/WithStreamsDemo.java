package corejava.com.demo.streamsjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {

	int id;
	String name;
	float price;

	public Product1() {

	}

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class WithStreamsDemo {

	public static void main(String[] args) {

		List<Product1> productlist = new ArrayList<Product1>();
		productlist.add(new Product1(1, "samsung", 1000f));
		productlist.add(new Product1(2, "iphone", 9000f));
		productlist.add(new Product1(1, "x", 2000f));
		productlist.add(new Product1(1, "y", 7000f));

		List<Float> productpricelist = productlist.stream().filter(p -> p.price < 7000).map(p -> p.price)
				.collect(Collectors.toList());

		System.out.println(productpricelist);

	}

}
