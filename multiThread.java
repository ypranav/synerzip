package threads;

public class multiThread implements Runnable{

		@Override
		    public void run() {}
							  
		    public static void main(String[] args) {
		    	
		        Thread multiThread = new Thread();
		        multiThread.start();
		        try{
		        	multiThread.sleep(500);
		        } 
		        catch (InterruptedException t){
		                 t.printStackTrace();
		        }
		        
		        multiThread.setPriority(1);
		        int priority = multiThread.getPriority();
		        System.out.println(priority);
		        
		        System.out.println("Thread is Running");
	}

}
