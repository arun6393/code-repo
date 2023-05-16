import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import test.Employee;

public class Execute {
	
	public static void main(String args[]) {
		
//	
//		Arrays.asList(null);
//		
//		Test t=new Test();
//		t.add(null);
//		
//	
//		new Thread(()->{
//			t.execute();
//		}).start();
//		
//		new Thread(()->{
//			t.execute();
//		}).start();
		
		
		Employee e=new Employee(1, "Arun");
		
		Map<Integer, Employee> employeeObjects=new HashMap<>();
		employeeObjects.put(e.getId(), e);
		employeeObjects.forEach((k,v)-> {
			System.out.println("Key is "+k +"value is "+v);
		});
		
		
		
		Employee e1=employeeObjects.get(1);
		e1.setName("Agarwal");
		employeeObjects.forEach((k,v)-> {
			System.out.println("Key is "+k +"value is "+v);
		});
		

		
	}

}


class Test{
	
	
	public void add(Object o) {
		System.out.println("add with Object");
	}
	
	public void add(String o) {
		System.out.println("add with String");
	}
	
	
	public void execute() {
		
		
		synchronized (this) {
			System.out.println("thread is "+Thread.currentThread());	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}