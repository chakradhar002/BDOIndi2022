package corejava.com.demo.collectionsdemo;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * 
  The important points about Java TreeMap class are:

Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.
 */

public class MapDemo {

	public static void main(String[] args) {
	
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(101, "ram");
		map.put(102, "ram");
		map.put(103, "tom");
		map.put(104, "mohan");
		
		for(Entry<Integer, String> m :map.entrySet()) {
			
			System.out.println("value for key "+m.getKey());
			System.out.println("value for value "+m.getValue());
		}

	}

}
