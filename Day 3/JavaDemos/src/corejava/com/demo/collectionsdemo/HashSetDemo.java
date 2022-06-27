package corejava.com.demo.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

/*
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75. 
 * */

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<String> al = new HashSet<>();
		al.add("ram");
		al.add("sharma");
		al.add(null);
		al.add("mohan");
		al.add("chakradhar");
		al.add("Prem kumar");

		Iterator<String> itr = al.iterator();
	
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}

		 al =null;//
		
	}

}
