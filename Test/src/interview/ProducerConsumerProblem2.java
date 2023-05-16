package interview;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumerProblem2 {

	public static void main(String args[]) {
	
		int size=10;
		Queue list=new Queue(size);
		AtomicInteger length=new AtomicInteger();
		ProducerConsumer producer=new ProducerConsumer(list, size,length);
		//ProducerConsumer consumer=new ProducerConsumer(list, size,length);
		
		Thread t1=new Thread(()->{
			producer.produce();
		});
		
		Thread t2=new Thread(()->{
			producer.consume();
		});
		
		t2.start();
		t1.start();
		
		
//			new Thread(()->{
//			
//			
//			producer.produce();
//			
//		}).start();
//	
//			
//			new Thread(()->{
//				
//				
//				consumer.consume();
//				
//			}).start();
	
	
	}
}

class ProducerConsumer{

	private Queue list;
	private int size;
	private static int data;
	private volatile AtomicInteger capacity;
	
	
	public ProducerConsumer(Queue list,int size,AtomicInteger capacity) {
		this.list=list;
		this.size=size;
		this.capacity=capacity;
	}
	
	
	public void produce() {
		System.out.println("in produce");
		try {
			while(true) {
		synchronized (this) {
			while(capacity.get()==size) {
				
					this.wait();
				
			}
				list.add(data++);
				System.out.println("ELement added by thread::"+Thread.currentThread().getName()+"is::"+ data);
				capacity.getAndIncrement();
				this.notifyAll();
				Thread.sleep(5000);
				
			
		}
		
	}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
	
	
	public void consume() {
		
		System.out.println("in comsume");
		
		try {
		while(true) {
		synchronized (this) {
			while(capacity.get()==0) {
				
					this.wait();
				
			}
			
				System.out.println("ELement removed by thread::"+Thread.currentThread().getName()+"is::"+ list.remove());
				capacity.getAndDecrement();
				this.notifyAll();
				Thread.sleep(1000);
				
			
		}
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
}
}


