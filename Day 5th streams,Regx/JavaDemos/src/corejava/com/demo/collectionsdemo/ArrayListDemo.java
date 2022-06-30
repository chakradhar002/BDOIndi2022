package corejava.com.demo.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

/*
 * Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because the array works on an index basis.
In ArrayList, manipulation is a little bit slower than the LinkedList in
 Java because a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int,
 float, char, etc. It is required to use the required wrapper class in such cases. For example:
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> listinteger = new ArrayList<Integer>();
		listinteger.add(45);
		listinteger.add(78);
		listinteger.add(62);
		
		listinteger.remove(1);

		for (Integer t : listinteger) {

			System.out.println(t);
		}
		
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("Ram");
		lists.add("tom");
		
		for (String t : lists) {

			System.out.println(t);
		}

	}

}
