import java.util.LinkedHashMap;

public class TestInterfaceImpl implements TestInterface{

	
	public void m3() {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

	}
	
	
	public static void m8() {
		//TestInterface.super.m7();
		TestInterface.m8();
		System.out.println("InterfaceImpl m8");
	}
	
	public void m7() {
		TestInterface.m8();
		System.out.println("InterfaceImpl m7");
	}
	
	
	public static void main(String args[]) {
		TestInterface t1=new TestInterfaceImpl();
		t1.m4();
		t1.m7();
		TestInterface.m8();
		
	}
	
}
