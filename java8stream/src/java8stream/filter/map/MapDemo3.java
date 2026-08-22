package java8stream.filter.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,8,9);
		List<Integer> multiple = new ArrayList<>();
		
		/*
		// before 8
		
		for(int num : numbers)
		{
			System.out.println("MapDemo3.main() : " + num * 3);
		}
		
		
		// with stream
		multiple = numbers.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println("MapDemo3.main() : " + multiple);
		*/
		
		// or
		numbers.stream().map(num-> num*3).forEach(System.out::println);
	}

}
