package corejava.com.demo.exception;

public class ExceptionDemo {

	public static void main(String ar[]) {

		int a = 10;
		int b = 0;
		int d[]= {1,2,3,4};
		try {
		
			 d[8]=9;
			System.out.println(" --- 1" );
		} catch (ArithmeticException e) {
			System.out.println(" --- 2" + e);
		}
		
		 catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" --- 2" + e);
			}
		System.out.println(" --- 3");
		
	}

}
