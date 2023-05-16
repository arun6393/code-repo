import java.util.concurrent.atomic.AtomicInteger;

public class PrintUsing3Threads {
	
	
	private int number=1;
	private int sequence;
	private int noOfThreads;
	private AtomicInteger atomicNumber=new AtomicInteger(1);
	
	public PrintUsing3Threads(int noOfThreads,int sequence) {
		this.sequence=sequence;
		this.noOfThreads=noOfThreads;
	}

	
	
	public void print(int result) {
		
		
		
//		while(atomicNumber.get()<= sequence) {
//			if(atomicNumber.get()%noOfThreads==result) {
//				System.out.println(Thread.currentThread().getName()+" "+ atomicNumber.getAndIncrement());
//			}
//		}
		
		
		
		synchronized (this) {
			
			if(number==sequence-1) {
				System.out.println(number);
			}
			while(number< sequence) {
				while(number%noOfThreads!=result) {
					try {
						wait();
						System.out.println(Thread.currentThread().getName() + " Got the lock with ::"+number);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				System.out.println(Thread.currentThread().getName()+" "+ number++);
				notifyAll();
				
			}
			
			
		}
		
		
		
	}
	
	
}
