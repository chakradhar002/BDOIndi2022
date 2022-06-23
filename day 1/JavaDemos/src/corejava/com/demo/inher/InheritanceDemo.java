package corejava.com.demo.inher;

class Car{
	 void Engine(){
		 System.out.println("engine");
 }
}
class Tata extends Car{
	 void Engine(){
		 System.out.println("engine tata v2");
	 }
}
class Hundai extends Car{
	
	 void Engine(){
		 
		 System.out.println("engine tata z2");
	 }
}


public class InheritanceDemo {

	public static void main(String arg[]) {
		Car c1 = new Tata();//dynamic dispatch or runtime polymorphism  Tata t = new Tata
		c1.Engine();
		
		Car c = new Hundai();
		c.Engine();
	}
}
