package corejava.com.demo;

class AddDemo {

	void Show(int number1,int numbr2) {

		int result = number1 + numbr2;
		System.out.println("add of two num " + result);
	}

}

public class ClassAndMethodDemo {

	public static void main(String arg[]) {

		AddDemo addDemo = new AddDemo();
		addDemo.Show(75,20);
	}

}
