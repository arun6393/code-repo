package interview;



public class ProducerConsumerProblem {

	public static void main(String args[]) {
	
		int size=10;
		Queue list=new Queue(size);
		
		Producer producer=new Producer(list, size);
		Consumer consumer=new Consumer(list, size);
	
	
	Thread t1=new Thread(producer, "THread-1");
	Thread t2=new Thread(consumer, "THread-2");
	
	t1.start();
	t2.start();
	
	
	}
}

class Producer implements Runnable{

	private Queue list;
	private int size;
	private static int data;
	
	public Producer(Queue list,int size) {
		this.list=list;
		this.size=size;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
		synchronized (list) {
			while(this.list.getSize()==size) {
				
					list.wait();
				
			}
				list.add(data++);
				System.out.println("ELement added by thread::"+Thread.currentThread().getName()+"is::"+ data);
				list.notifyAll();
				Thread.sleep(1000);
			
		}
		
	}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}


class Consumer implements Runnable{

	private Queue list;
	private int size;
	
	public Consumer(Queue list,int size) {
		this.list=list;
		this.size=size;
	}
	
	@Override
	public void run() {
		try {
		while(true) {
		synchronized (list) {
			while(this.list.getSize()==0) {
				
					list.wait();
				
			}
			
				System.out.println("ELement removed by thread::"+Thread.currentThread().getName()+"is::"+ list.remove());
				list.notifyAll();
				Thread.sleep(1000);
			
		}
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
}
}


