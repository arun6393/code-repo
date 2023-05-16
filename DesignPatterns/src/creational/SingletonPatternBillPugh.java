package creational;

import java.io.Serializable;

public class SingletonPatternBillPugh implements Serializable,Cloneable{
	

	private static final long serialVersionUID = 1L;
	
	// volatile is important , so that each thread has the correct latest value 
	private static volatile SingletonPatternBillPugh INSTANCE;
	private static final int a=10;
	private String name;
	private String surName;
	
	private SingletonPatternBillPugh() {
		
	}
	
	
	private static class SingletonPatternBuilder{
		private static final SingletonPatternBillPugh INSTANCE=new SingletonPatternBillPugh();
	}
	
	public static SingletonPatternBillPugh getInstance() {
		
		return SingletonPatternBuilder.INSTANCE;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSurName() {
		return this.surName;
	}
	
	public Object readResolve() {
		return INSTANCE;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// either throw an exception or return the same instance
		
		return INSTANCE;
	}

}
