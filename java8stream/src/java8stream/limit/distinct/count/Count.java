package java8stream.limit.distinct.count;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Count {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,76,7,8,9,12,2,3,34,5,6,78,90,21,65,34,65,7,43);
       
		// count
		long even =  numberList.stream().filter(num->num%2==0).count();
        
        System.out.println("Find Even Number :  " + even);    // Find Even Number :  12
        
        
        // min()
        
       Optional<Integer> minList = numberList.stream().min((val1,val2)-> {
        	return val1.compareTo(val2);
        
       });
       System.out.println("Count Min : " + minList.get());
       
      Optional<Integer> max = numberList.stream().max((val1, val2)->{
    	   return val1.compareTo(val2);
       });
     System.out.println("Count.max : " + max.get());
        
	}

}
