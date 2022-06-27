package corejava.com.demo.callabledemo;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {

		Random rd = new Random();

		Integer rdnumber = rd.nextInt(10);

		Thread.sleep(rdnumber * 1000);

		return rdnumber;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask[] randomNumberTask = new FutureTask[5];
      //creating task here
		for (int i = 0; i < 5; i++) {

			Callable c = new MyCallable();
			randomNumberTask[i] = new FutureTask(c);
			Thread t = new Thread(randomNumberTask[i]);
			t.start();

		}

		//// loop for receiving the random numbers
		for (int i = 0; i < 5; i++) {

			Object o = randomNumberTask[i].get();

			System.out.println(" the random number " + o);

		}

	}

}
