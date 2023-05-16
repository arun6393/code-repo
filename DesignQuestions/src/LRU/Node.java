package LRU;

import java.util.Objects;

public class Node {
	
	private int key;
	private int value;
	private Node next;
	private Node prev;
	
	
	public Node() {
		
	}
	
	public Node(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	public Node(int key, int value, Node next, Node prev) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", next=" + next + ", prev=" + prev + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(key, next, prev, value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return key == other.key && Objects.equals(next, other.next) && Objects.equals(prev, other.prev)
				&& value == other.value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
