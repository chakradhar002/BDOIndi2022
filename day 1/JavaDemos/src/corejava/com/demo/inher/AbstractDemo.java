package corejava.com.demo.inher;

abstract class Car1{
	 abstract void show();
	
	void Engine(){
		 System.out.println("engine");
 }
}
class Tata1 extends Car1{
	 void Engine(){
		 System.out.println("engine tata v2");
	 }


	void show() {
		// TODO Auto-generated method stub
		
	}
}
class Hundai1 extends Car1{
	
	 void Engine(){
		 
		 System.out.println("engine tata z2");
	 }


	void show() {
		// TODO Auto-generated method stub
		
	}
}


public class AbstractDemo {

	public static void main(String arg[]) {
		Car1 c1 = new Tata1();//dynamic dispatch or runtime polymorphism  Tata t = new Tata
		c1.Engine();
		
		Car1 c = new Hundai1();
		c.Engine();
		
	}
}
