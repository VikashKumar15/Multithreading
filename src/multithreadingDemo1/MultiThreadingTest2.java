package multithreadingDemo1;

//class MyTask {
//	
//	public void executeTask() {
//		for(int doc=0; doc<=10; doc++) {
//			System.out.println("Using printer 2");
//		}
//	}
//}

//In case your MyTask class already extends some other class then you need to use implement runnable
//multiple inheritance is not supported n java.

//Now MyTasks IS-A thread
class MyTask extends Thread{
	
	@Override
	public void run() {
		for(int doc=0; doc<=100; doc++) {
			System.out.println("#####Using printer 2 ======"+doc);
		}
	}
}


public class MultiThreadingTest2 {
	//Main method represents main thread
	public static void main(String[] args) {
		//Whatever we write here will always executed by main thread.
		//Threads always execute jobs in sequence.
		//That is why thread is EXECUTION CONTEXT (always execute job in sequence)
		
		
		//Job 1
		System.out.println("---Application Started---");
		
		//Job 2
		MyTask task = new MyTask();   //Child thread or Worker Thread.
		task.start();  //will internally call run method
		
		
		//Now main and MyTask thread is executing parallelly or concurrently.
		
		//job 3
		
		for(int doc=0; doc<=100; doc++) {
			System.out.println("#######Using printer 3");
		}
		
		//Job 4
		System.out.println("---Application Finished---");
	}
}
