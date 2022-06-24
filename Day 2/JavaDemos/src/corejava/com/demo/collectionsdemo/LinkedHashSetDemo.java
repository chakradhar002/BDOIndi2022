package corejava.com.demo.collectionsdemo;
/*
*
*

Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

 
public class LinkedHashSetDemo {

	public static void main(String[] args) {

	    Set<String> al = new LinkedHashSet<String>();
		al.add("ram");
		al.add("sharma");
		al.add("mohan");
		al.add("chakradhar");
		al.add("Prem kumar");
		al.add("ram");
		al.add("ram");
		al.add("ram");
		al.add("ram");
		al.add(null);

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		al = null;//

	}

}
