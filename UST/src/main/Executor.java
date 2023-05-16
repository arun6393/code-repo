package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Executor {
	
	public static void main(String args[]) {
		
		
		String name="arunagarwal";
		
		List<String> data=Arrays.asList(name.split(""));
		
		
		Map<String,Long> d=data
				.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		for(String key:d.keySet()) {
			
			System.out.println(key + "  "+ d.get(key));
			
		}
		
		
		
	}

}
