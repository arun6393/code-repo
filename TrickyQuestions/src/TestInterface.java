
public interface TestInterface {
	
	//protected void m1();
	
	//strictfp void m2();
	
	private void m3() {
		
	}

	
	
	default void m4() {
		m3();
	}
	
	
	//default void m5();
	
	//static void m6();
	
	default void m7() {
		System.out.println("Interface m7");
	}
	
	static void m8() {
		System.out.println("Interface m8");
	}
	
	
	
}
