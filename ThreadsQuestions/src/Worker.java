import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Worker {

	private List<Integer> l1 = new ArrayList<>();
	private List<Integer> l2 = new ArrayList<>();
	private Object o1=new Object();
	private Object o2=new Object();

	public void stage1() {
		//System.out.println("Thread waiting to get lock for  stage1 is ::"+Thread.currentThread().getName());
		synchronized (o1) {
			//System.out.println("Thread running stage1 is ::"+Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			l1.add(RandomGenerator.getDefault().nextInt(100));
		}
		

	}

	public void stage2() {
		//System.out.println("Thread waiting to get lock for  stage2 is ::"+Thread.currentThread().getName());
		synchronized (o2) {
			//System.out.println("Thread running stage2 is ::"+Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			l2.add(RandomGenerator.getDefault().nextInt(100));
		}

	}
	
	public void process() {
		for(int i=0;i<1000;i++) {
			//System.out.println("Thread will try to run stage1 ::"+Thread.currentThread().getName());
			stage1();
			//System.out.println("Thread will try to run stage2 ::"+Thread.currentThread().getName());
			stage2();
		}
	}
	
	public List<Integer> getL1(){
		return l1;
	}
	
	public List<Integer> getL2(){
		return l2;
	}

//	public static void main(String args[]) {
//
//		Worker w=new Worker();
//		
//		System.out.println("Starting....");
//		
//		
//		long start=System.currentTimeMillis();
//		
//		
//		Thread t1=new Thread(()-> w.process(),"Thread-1");
//		
//		
//		Thread t2=new Thread(()-> w.process(),"Thread-2");
//		
//		t1.start();
//		t2.start();
//		
//		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		long end=System.currentTimeMillis();
//		
//		System.out.println("time taken "+(end-start));
//		System.out.println("List1::"+w.getL1().size() +" List2::"+w.getL2().size());
//		
//		
//	}
	
	public void main() {

		//Worker w=new Worker();
		
		System.out.println("Starting....");
		
		
		long start=System.currentTimeMillis();
		
		
		Thread t1=new Thread(()-> process(),"Thread-1");
		
		
		Thread t2=new Thread(()-> process(),"Thread-2");
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long end=System.currentTimeMillis();
		
		System.out.println("time taken "+(end-start));
		System.out.println("List1::"+getL1().size() +" List2::"+getL2().size());
		
		
	}

}
