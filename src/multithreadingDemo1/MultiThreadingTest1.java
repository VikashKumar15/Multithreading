package multithreadingDemo1;

public class MultiThreadingTest1 {
	
	//Main method represents main thread
	public static void main(String[] args) {
		//Whatever we write here will always executed by main thread.
		//Threads always execute jobs in sequence.
		//That is why thread is EXECUTION CONTEXT (always execute job in sequence)
		
		System.out.println("Start thread testing");
		Thread thread1 = new Thread(new MyThread1());
		thread1.start();
	}

}
