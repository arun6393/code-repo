
public class Executor {
	
	public static void main(String args[]) {
		
		
		PrintUsing3Threads printUsing3Threads=new PrintUsing3Threads(3, 10);
		
		Thread t1=new Thread(new Print3ThreadsRunnable(printUsing3Threads, 1),"Thread-1");
		Thread t2=new Thread(new Print3ThreadsRunnable(printUsing3Threads, 2),"Thread-2");
		Thread t3=new Thread(new Print3ThreadsRunnable(printUsing3Threads, 0),"Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
