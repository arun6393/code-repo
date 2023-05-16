import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String args[]) {
		
		
		String input[]  = {"A", "B", "C", "D", "A", "C", "A", "D"};
		
		
		Map<String,Long> dataCount=Stream.of(input).collect(Collectors.groupingBy(data-> data.toString(),Collectors.counting()));
		//Stream.of(dataCount).sorted(Comparator.comparing())
		
		
		
		
		
		for(String character:dataCount.keySet()) {
			
			
			
		
			//Collections.sort(dataCount.get(character),new Long() );
			
			
			
		}
		
		
		//Stream.of(dataCount).sorted(Comparator.comparing())
		
	}
	
}
