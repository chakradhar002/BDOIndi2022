package corejava.com.demo.collectionsdemo;

/*
*
*

Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.
The TreeSet can only allow those generic types that are comparable.
 For example The Comparable interface is being implemented by the StringBuffer class.
* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 
public class TreeSetDemo {

	public static void main(String[] args) {

	    Set<String> al = new TreeSet<String>();
		al.add("ram");
		al.add("sharma");
		al.add("mohan");
		al.add("chakradhar");
		al.add("Prem kumar");
		al.add("ram");
		al.add("Ashish");


		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		al = null;//

	}

}
