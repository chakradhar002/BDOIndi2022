package corejava.com.demo;


class AddDemoWithParameterReturnType {

	int Show(int number1, int numbr2) {

		int result = number1 + numbr2;

		return result;

	}

}

//client prg html or bootstrap or angular or react in future
public class MethodDemoWithReturnType {

	public static void main(String arg[]) {

		AddDemoWithParameterReturnType addDemo = new AddDemoWithParameterReturnType();

		int tempresult = addDemo.Show(75, 44);
		
		System.out.println("add of two num " + tempresult);
	}

}

