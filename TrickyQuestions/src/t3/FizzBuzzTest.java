package t3;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzTest {
	
	
	public static void main(String args[]) {
	
		List<Divider> dividers=new LinkedList<>();
		dividers.add(new Divider("FizzBuzz", 15));
		dividers.add(new Divider("Buzz", 5));
		dividers.add(new Divider("Fizz", 3));
		
//	  List<Divider> dividers = List.of(
//	    new Divider("Fizz", 3),
//	    new Divider("Buzz", 5),
//	    new Divider("FizzBuzz", 15)
//	  );
	  FizzBuzz fizzBuzz = new FizzBuzz(dividers);
	  System.out.println(fizzBuzz.getOutput(15));
}
}