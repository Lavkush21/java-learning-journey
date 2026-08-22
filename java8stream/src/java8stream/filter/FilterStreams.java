package java8stream.filter;
import java.util.*;
import java.util.stream.Collectors;

public class FilterStreams {

	public static void main(String[] args) {
	 List <Integer> list =Arrays.asList(10, 20, 40,30,45,12);
	 List<Integer>even = new ArrayList<>();
	 
	//  
	 //  without using streams
	 for(int n : list) {
		 if(n % 2 == 0) {
			 even.add(n);
		 }
		 System.out.print(even);
	 }
	 // producer consumer -2
	 
	even = list.stream().filter(n-> n % 2 ==0).collect(Collectors.toList());
	 System.out.println("FilterStreams.main() :" + even);  
	 
	 //  type - 3
	 
	 list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	
	 // type - 4
	 list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
