package interview;

import java.util.concurrent.atomic.AtomicInteger;

public class Queue {
	
	private Node head;
	private AtomicInteger capacity=new AtomicInteger();
	private int maxSize;
	
	
	public Queue(int maxSize) {
		this.maxSize=maxSize;
	}
	
	public void add(int data) {
		
		
		if(capacity.get()!=maxSize) {
		
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
		}else {
			Node root=head;
			
			while(root.getNext()!=null) {
				root=root.getNext();
			}
			
			root.setNext(newNode);
			
		}
		
		capacity.incrementAndGet();
		
		}else {
			System.out.println("Max capacity reached");
		}
	}
	
	public int remove() {
		if(head==null) {
			System.out.println("No elements in the List");
			return -1;
		}else {
			Node nodeToBeRemoved=head;
			head=head.getNext();
			capacity.decrementAndGet();
			return nodeToBeRemoved.getData();
		}
	}
	
	
	public void print() {
		Node root=head;
		
		if(head==null) {
			System.out.println("No elements in the List");
		}else {
			while(root!=null) {
				System.out.println(root.getData());
				root=root.getNext();
			}
		}
		
		
	}
	
	
	public void addALoop(int firstNodeData,int secondNodeData) {
		
		Node root=head;
		Node firstNode=null;
		Node secondNode=null;
		while(root!=null) {
			if(root.getData()==firstNodeData) {
				firstNode=root;
			}
			else if(root.getData()==secondNodeData) {
				secondNode=root;
			}
			root=root.getNext();
		}
				
		
		firstNode.setNext(secondNode);
		System.out.println("Loop Introduced");
		
		
	}
	
	public void detectALoop() {
		
		Node slowPointer=head;
		Node fastPointer=head;
		boolean isLoopPresent=false;
		
		while(
				slowPointer!=null 
				&& 
				fastPointer!=null 
				&& 
				fastPointer.getNext()!=null
			) {
			
			slowPointer=slowPointer.getNext();
			fastPointer=fastPointer.getNext().getNext();
			
			
			if(slowPointer==fastPointer) {
				isLoopPresent=true;
				break;
			}
			
			
			
		
			
		}
		
		System.out.println("both pointers are at"+slowPointer.getData());
		
		if(isLoopPresent) {
			
			Node root=head;
			
			while(root!=fastPointer) {
				root=root.getNext();
				fastPointer=fastPointer.getNext();
			}
			
	
			System.out.println("Loop is Detected at element "+root.getData());
			
		}else {
			System.out.println("No Loop Detected");
		}
		
		
	}
	
	

	public int getSize() {
		return this.capacity.get();
	}
	
	

}
