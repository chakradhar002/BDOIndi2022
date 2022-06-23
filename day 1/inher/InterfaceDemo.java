package corejava.com.demo.inher;

interface Car2 {
	void show();
	void show1();

}

class Tata2 implements Car2 {

	@Override
	public void show() {
		System.out.println("show tata");

	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}


}

public class InterfaceDemo {

	public static void main(String arg[]) {
		Car2 c1 = new Tata2();// dynamic dispatch or runtime polymorphism Tata t = new Tata
		c1.show();



	}
}
