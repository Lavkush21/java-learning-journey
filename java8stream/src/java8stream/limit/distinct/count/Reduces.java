package java8stream.limit.distinct.count;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduces {

	public static void main(String[] args) {
	
        List<String> stringList = Arrays.asList("A","B","C","D","1","2","3","4");
        
        Optional<String> op =stringList.stream().reduce((value,c)->{
        	return c + value;
        });
        System.out.println("Reduce Objects : " + op.get()); // 4321DCBA
        
	}

}
