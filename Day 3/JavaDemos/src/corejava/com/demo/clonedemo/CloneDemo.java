package corejava.com.demo.clonedemo;

/*
 * 
 * The class whose object’s copy is to be made must have a public clone method in it or in one of its parent class.  

Every class that implements clone() should call super.clone() to obtain the cloned object reference.
The class must also implement java.lang.Cloneable interface whose object clone we want to create otherwise it will throw CloneNotSupportedException when clone method is called on that class’s object.
Syntax:
 * 
 */

class Test {

	int x, y;
}

class Test2 implements Cloneable {

	int a, b;
	
	Test t1 = new Test();
      //declaration of clone method given by java
	public Object clone() throws CloneNotSupportedException {

		return super.clone();//calling super class method clone

	}

}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test2 t= new Test2();
		t.a=10;
		t.b=20;
		
		t.t1.x=45;//this is holdling  object of Test class x,y
		
		Test2  t2 = (Test2)t;
			
		System.out.println(t2.a);
		
		//System.out.println(t.t1.x);
		
	}

}
