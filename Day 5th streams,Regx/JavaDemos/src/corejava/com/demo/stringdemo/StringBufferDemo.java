package corejava.com.demo.stringdemo;

public class StringBufferDemo {

	public static void main(String ar[]) {

		String s = new String("Ram");
		String s1="RAM";
		String s3=s1;
		StringBuffer b = new StringBuffer("Ram");
	    System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		StringBuilder b1 = new StringBuilder("Ram");
		

	}

}
