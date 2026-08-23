package java8stream.flatmaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

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
		
		// Unpacks the nested lists and transforms each internal integer element by +10
		List<Integer> finalresult = finalList.stream()
				                             .flatMap(x -> x.stream().map(n->n+10))
				                             .collect(Collectors.toList());
		
		//  Shows the actual altered results
		System.out.println("flatMap() result : " + finalresult); // [11, 12, 13, 14, 15, 16]
	}
}
