package threads;

															//multithread1	
	public class threadExample {
														   //main function
		public static void main(String[] args) {
		 
		  multithread threadguru1 = new multithread("T1");
		  threadguru1.start();
		  multithread threadguru2 = new multithread("T2");
		  threadguru2.start();
		 }
		}

												   		  // multithread2								
	class multithread implements Runnable {
			
				Thread thread1;
				private String threadname;
					multithread(String name) {
							threadname = name;
											}
		 
		 @Override
		 public void run() {
			 System.out.println("Thread running" + threadname);
		  for (int i = 0; i < 4; i++) {
			  System.out.println(i);
			  System.out.println(threadname);
			  
		   			try {
		   					Thread.sleep(500);
		   				} 
		   			catch (InterruptedException e) {
		   						System.out.println("Thread is interrupted");
		   									}
		  								}
		  
		 }
		 
		 public void start() {
			 System.out.println("Thread started");			 
			 	if (thread1 == null) {
				 	thread1 = new Thread(this, threadname);
				 	thread1.start();
			 							}
		 		 			 }

}

