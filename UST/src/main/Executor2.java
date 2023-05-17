package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Executor2 {
	
	public static void main(String args[]) {
		
		
		char[] in={'A', 'C', 'C', 'B', 'A', 'B', 'A', 'D'};
		
		IntStream.range(0, in.length).mapToObj(i -> in[i])
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.sorted(Collections.reverseOrder(Map.Entry.<Character,Long>comparingByValue()).thenComparing(entry-> entry.getKey()))
//		.collect(Collectors.toMap(
//                Map.Entry::getKey,
//                Map.Entry::getValue,
//                (e1, e2) -> e1, LinkedHashMap::new))
				//.thenComparing(Map.Entry.comparingByKey()))
		.limit(2)
		.toList()
		.stream()
		.forEach(data-> System.out.println(data));
		;
				//.thenComparing(Map.Entry.comparingByKey()));
				//.thenComparing(Map.Entry.comparingByKey()));
		
		
		
		
		
		B b =new B();
		A a =new B();
		A a1 = new A();
		//B b1 = (B) new A();
		
		System.out.println(b.size);
		System.out.println(a.size);
		System.out.println(a1.size);
		//System.out.println(b1.size);
		
		b.M1(Integer.valueOf(10));
		
		method(null);
		method(10L);
		method(Integer.valueOf(10));
		method(10);
		
		
	}
	
	public static void main(int a){
		


	}
	

	
	public static void method(Number o) {
		  System.out.println("Number method");
		 }
		public static void method(Integer o) {
		  System.out.println("Intger method");
		 } 
		  public static void method(long s) {
		  System.out.println("long method");
		 }
		  public static void method(int s) {
			  System.out.println("int method");
			 }
		  
		  public static void method(Object o) {
			  System.out.println("Object method");
			 }
		  
		 
//			 public static void method(String s) {
//			  System.out.println("String method");
//			 }

}


class A {

int size=10;

protected void M1(int x) {
	System.out.println(size);
}

}


class B extends A{

int size=20;

protected void M1(Integer x) {
System.out.println(this.size);
}



}
