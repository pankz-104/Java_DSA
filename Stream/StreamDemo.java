package Stream;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
	public static void main(String [] args) {
		// create a list of integers
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		
		//demonstration of map method 
		List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(square);
		
		// create a list of string 
		List<String> names = Arrays.asList("this","is","a","code");
		
		//demonstration of filter method
		List<String> result = names.stream().filter(s->s.startsWith("t")).collect(Collectors.toList());
		System.out.println(result);
		
		// demonstration of sorted method 
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		// creating a list of integers
		List<Integer> nums = Arrays.asList(2,3,4,5,2,3);
		
		// collect method returns a set
		List<Integer> res = nums.stream().map(s-> s*s).collect(Collectors.toList());		
		System.out.println(res);
		
		Set<Integer> out = nums.stream().map(s->s*s).collect(Collectors.toSet());
		System.out.println(out);
		
		// forEach method iterates through every element of stream 
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		// reduce method used to reduce elements of  stream to single value 
		List<Integer> numbers = Arrays.asList(2,3,4,5);
		int even = numbers.stream().filter(x->x%2==0).reduce(0, (ans, i)-> ans+i);
		System.out.println(even);
	}
}
