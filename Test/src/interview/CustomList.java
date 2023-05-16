package interview;

import java.util.Arrays;

public class CustomList<T> {

	
	private Object[] data;
	private int size;
	public int defaultSize=10;
	
	
	public CustomList() {
		data=new Object[defaultSize];
	}
	
	public CustomList(int size) {
		data=new Object[size];
	}
	
	public void add(T t) {
		if(size==data.length) {
			data=grow();	
		}
		data[size]=t;
		size++;
	}
	

	private Object[] grow() {
		return Arrays.copyOf(data, defaultSize*2);	
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int remove() {
			return 1;
	}
	
}
