package corejava.com.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	private String message;

	public WorkerThread(String s) {

		this.message = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "(Start message = " + message);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "(End message = " + message);
		

	}


}

public class ThreadPoolDemo {
	public static void main(String ar[]) {
		ExecutorService exe = Executors.newFixedThreadPool(5);//thread pool
		
		
		for (int i = 0; i < 8; i++) {    // i=0  i 1 =2 i =2

			Runnable worker = new WorkerThread(" " + i);//this is resposible for creating thread
			exe.execute(worker);// calling execute method of ExectorService here
		}
		exe.shutdown();
		
		while (!exe.isTerminated()) {
			//System.out.println("in progress");

		}

		System.out.println("finished all task");

	}

}
