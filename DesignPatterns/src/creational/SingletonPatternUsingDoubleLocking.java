package creational;

import java.io.Serializable;

public class SingletonPatternUsingDoubleLocking implements Serializable,Cloneable{
	

	private static final long serialVersionUID = 1L;
	
	// volatile is important , so that each thread has the correct latest value 
	private static volatile SingletonPatternUsingDoubleLocking INSTANCE;
	private static final int a=10;
	private Integer id;
	private String name;
	private String surName;
	
	private SingletonPatternUsingDoubleLocking() {
		
	}
	
	
	public static SingletonPatternUsingDoubleLocking getInstance() {
		
		if(INSTANCE==null) {
			synchronized (SingletonPatternUsingDoubleLocking.class) {
				if(INSTANCE==null) {
					INSTANCE=new SingletonPatternUsingDoubleLocking();
					INSTANCE.name="Arun";
					INSTANCE.surName="Agarwal";
				}
			}
		}
		
		return INSTANCE;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSurName() {
		return this.surName;
	}
	public Integer getId() {
		return this.id;
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
