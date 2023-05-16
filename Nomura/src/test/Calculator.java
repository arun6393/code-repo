package test;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	
	
	
	
	
	
	public void m1() {
		
		
		List<Integer> data=new ArrayList<>();
		for(int i=0;i<20;i++) {
			data.add(i);
		}
		
		
		
		int result=data
		.stream()
		.filter(d-> d%2!=0)
		.reduce(0, Integer::sum);
		
		System.out.println(result);
		
	}
	
	
	
	
	public int divide(int a , int b) throws Exception {
		
		if(b==0) {
			throw new Exception("cannot divide by 0");
		}
		return a/b;
	}

}
