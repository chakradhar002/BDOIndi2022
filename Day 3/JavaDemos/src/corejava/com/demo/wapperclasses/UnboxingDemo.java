package corejava.com.demo.wapperclasses;

import java.util.ArrayList;

public class UnboxingDemo {

	public static void main(String[] args) {
		// obj of integer

		Integer k = new Integer(10);

		// unboxing the object
		int p = k;
		System.out.println(k);
		System.out.println(p);

		// unboxing the object
		Character a = 'p';
		char ch = a;
		System.out.println(a);
		System.out.println(ch);
		
		 ArrayList<Character> chdemo = new ArrayList<Character>();
		 
			Character a1 = (Character)ch;  //type casting developer need to write
		 chdemo.add(a1);// Autoboxing- primitive to Character object conversion 
		 System.out.println("--- "+chdemo.get(0));

	}
}
