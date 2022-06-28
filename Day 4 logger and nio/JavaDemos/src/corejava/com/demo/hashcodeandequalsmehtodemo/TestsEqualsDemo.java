package corejava.com.demo.hashcodeandequalsmehtodemo;

public class TestsEqualsDemo {
	
	public static void main(String ar[]) {

		
		
		String s1="RAM";
		String s2="RAM";
		
		String s3="RAM";
		String s4="rAM";
		
		
		if(s1.equals(s2)) {
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		}
		
	if(!s3.equals(s4)) {
			
			System.out.println(s3.hashCode());
			System.out.println(s4.hashCode());
		}
		

	}

}
