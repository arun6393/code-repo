package learning;

public class Executor {

	public static void main(String args[]) {
		FInterface fInterface=()-> System.out.println("hello");
		
		
		fInterface.accept();
		
		
		long x=Integer.MAX_VALUE+1L;
		
		System.out.println(x);
		System.out.println(Integer.MAX_VALUE);
		
	}
	
}
