
package threads;

public class fetchThread implements Runnable{
	
	  @Override
	    public void run() { }   
	  
    public static void main(String[] args) {
    	
        Thread fetchThread1 = new Thread("T1");
        Thread fetchThread2 = new Thread("T2");
        
        fetchThread1.start();
        fetchThread2.start();
        
        System.out.println("The thread names are-");
        System.out.println(fetchThread1.getName());
        System.out.println(fetchThread2.getName());
    }
    
}

