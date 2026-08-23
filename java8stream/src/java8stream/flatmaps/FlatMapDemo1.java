package java8stream.flatmaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		
		// 1. map() Example
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list2 = list.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println("map() result : " + list2); // [11, 12, 13, 14, 15, 16, 17, 18, 19]
		
		// 2. flatMap() Example
		List<Integer> list11 = Arrays.asList(1,2);
		List<Integer> list12 = Arrays.asList(3,4);
		List<Integer> list13 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list11, list12, list13);
		
		//  Added Integer type parameter to the List declaration
		List<Integer> finalresult = finalList.stream()
				                             .flatMap(x -> x.stream())
				                             .collect(Collectors.toList());
		
		// Print statement to verify output
		System.out.println("flatMap() result : " + finalresult); // [1, 2, 3, 4, 5, 6]
	}
}
