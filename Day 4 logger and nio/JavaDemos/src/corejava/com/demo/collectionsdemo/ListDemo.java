package corejava.com.demo.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> listinteger = new ArrayList<Integer>();
		listinteger.add(45);
		listinteger.add(78);
		listinteger.add(62);
		
		listinteger.remove(1);

		for (Integer t : listinteger) {

			System.out.println(t);
		}
		
		List<String> lists = new ArrayList<String>();
		lists.add("Ram");
		lists.add("tom");
		
		for (String t : lists) {

			System.out.println(t);
		}

	}

}
