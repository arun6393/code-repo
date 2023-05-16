package creational;

public class SingletonPatternBillPugh2 {

	
	private SingletonPatternBillPugh2() {
		
	}
	
	
	
	private static class SingletonPatternBillPugh2Builder{
		private static final SingletonPatternBillPugh2 singletonPatternBillPugh2=new SingletonPatternBillPugh2();
	}
	
	public static SingletonPatternBillPugh2 getInstance() {
		return SingletonPatternBillPugh2Builder.singletonPatternBillPugh2;
	}
	
	
}
