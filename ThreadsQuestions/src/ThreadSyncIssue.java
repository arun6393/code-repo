
public class ThreadSyncIssue {
	
	public synchronized void m1() throws InterruptedException {
		System.out.println("In m1");
		Thread.sleep(1000);
		System.out.println("Callin m2");
		m2();
		System.out.println("Called m2");
	}
	
	public synchronized void m2() throws InterruptedException {
		System.out.println("In m2");
		Thread.sleep(1000);
		System.out.println("Calling m3");
		m3();
		System.out.println("Called m3");
	}
	
	
	public synchronized void m3() throws InterruptedException {
		System.out.println("In m3");
		Thread.sleep(1000);
	}
	
	
	public static void main(String args[]) {
		ThreadSyncIssue issue=new ThreadSyncIssue();
		ThreadSyncIssue issue1=new ThreadSyncIssue();
		
		
//		new Thread(()->{
//			try {
//				issue.m1();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}).start();
		
		new Thread(()->{
			try {
				issue1.m2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				issue1.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		
	}
	

}
