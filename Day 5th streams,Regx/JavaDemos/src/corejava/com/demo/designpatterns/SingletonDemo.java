package corejava.com.demo.designpatterns;

class Singleton {

	private static Singleton instance1 = new Singleton();

	//// make the constructor private so that this class cannot be
	// instantiated

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance1;

	}

	public void show() {
		System.out.println(" hi");

	}

}

public class SingletonDemo {

	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();

		instance.show();

		Singleton instance1 = Singleton.getInstance();

		instance1.show();
	}

}
