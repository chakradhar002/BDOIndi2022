package corejava.com.demo.wapperclasses;

//Java program to demonstrate Autoboxing

import java.util.ArrayList;

class AutoboxingAndWrapperDemo {
	public static void main(String[] args) {
		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		 Character a = ch;//type conversions
	
		 ArrayList<Character> chdemo = new ArrayList<Character>();
		 chdemo.add(a);
		 System.out.println(chdemo.get(0));

	}
}
