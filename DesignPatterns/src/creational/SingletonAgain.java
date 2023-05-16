package creational;

import java.io.Serializable;

public final class SingletonAgain implements Cloneable,Serializable{

	
	private static final long serialVersionUID = 7782665495070317590L;

	private static volatile SingletonAgain INSTANCE;
	

	private SingletonAgain() {
		
	}
	
	
	// double locking 
	public static SingletonAgain getInstance1() {
		if(INSTANCE==null) {
			synchronized (SingletonAgain.class) {
				if(INSTANCE==null) {
					INSTANCE=new SingletonAgain();
				}
			}
		}
		return INSTANCE;
	}
	
	
	// other method
	private static class SingletonAgainBuilder {
		private static final SingletonAgain INSTANCE= new SingletonAgain();
	}
	
	public static SingletonAgain getInstance() {
		return SingletonAgainBuilder.INSTANCE;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}
	
	
	protected Object readResolve(){
		return getInstance();
	}
	
}
