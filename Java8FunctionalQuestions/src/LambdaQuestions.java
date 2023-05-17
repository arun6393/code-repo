import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;

import static java.util.Map.Entry.*;

public class LambdaQuestions {

	
	
	public static void main(String args[]) {
		
		
		List<Integer> data =Arrays.asList(10,9,8,null,4,null,null,3);
		
		List<Employee> employeeList = new ArrayList<>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 32500.0));
		
		
		
		Map.Entry<Double,List<Employee>>  e4=employeeList
		.stream()
		.collect
		(
				Collectors.groupingBy
				(employee->employee.getSalary(),
						Collectors.mapping
						(empl-> new Employee
								(empl.getId(), empl.getName(), empl.getAge(),empl.getGender(), empl.getDepartment(), empl.getYearOfJoining(),empl.getSalary())
								, Collectors.toList()
								)
						)
		).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().get(0);
		
		
		
		System.out.println(e4);
		
		
//		employeeList.stream()
//       .collect(
//    		   Collectors.groupingBy(st -> st.population,Collectors.mapping(st->new Triple(st.country,st.state,st.population),Collectors.toList()))
//    		   );
		
		
		
		
		
		List<Integer> data1=data.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).collect(Collectors.toList());
		
		
		System.out.println(data1.toString());
		
		
		// 42. Write a stream API to count the number of occurrences in the String.
		String string = "java springboot springcode spring java";
		List<String> list = Arrays.asList(string.split(" "));
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect.toString());
		
		
		//https://medium.com/@anil.java.story/second-highest-salary-using-java-streams-api-d8b5eb8051b5
			
		Map<String,Integer> map = new HashMap<>();
        map.put("anil",1000);
        map.put("ankit",1200);
        map.put("bhavna",1300);
        map.put("james",1400);
        map.put("micael",1500);
        map.put("tom",1600);
        map.put("daniel",1700);
        
//        map.entrySet()
//        .stream()
//        .sorted(Comparator.comparing(entry -> -entry.getValue())) // minus make it to do in desc order
//        .toList()
        
        
        Map.Entry<String,Integer> d=
        		map
        		.entrySet()
        		.stream()
        		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        		.toList()
        		.get(1);
			System.out.println(d);
			
			
			
			Map<String,Integer> map2 = new HashMap<>();
	        map2.put("anil",1000);
	        map2.put("ankit",1200);
	        map2.put("bhavna",1200);
	        map2.put("james",1200);
	        map2.put("micael",1000);
	        map2.put("tom",1300);
	        map2.put("daniel",1300);
			
			
			Map.Entry<Integer, List<String>> data2=
					map2
					.entrySet()
					.stream()
					.collect(Collectors.groupingBy(entry-> entry.getValue(),Collectors.mapping(entry-> entry.getKey(), Collectors.toList())))
					.entrySet()
					.stream()
					.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
					.toList()
					.get(1);
		
			System.out.println(data2);
			
			
			//{daniel=1300, tom=1300, ankit=1200, micael=1000, james=1200, bhavna=1200, anil=1000}
			Map<String, Integer> sortedStudentMap =map2.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey()))
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
			 System.out.println(sortedStudentMap);
		
		
	}
	
	
}
