package corejava.com.demo.collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains  insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 */
// pop() The method removes an element from the top of the stack and returns the same element as the value of that function.

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		List<String >a3 = new LinkedList<String>();
	    al.addFirst("chakradhar");
		al.add("ram");
		al.add("sharma");
		al.add("ram");
		
		
		al.addLast("kumar");

		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
