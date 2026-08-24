package java8stream.limit.distinct.count;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("A","B","C","D","1","2","3","4");
		Object arr[] = stringList.stream().toArray();
		System.out.println(arr.length);
		for(Object v : arr) {
			System.out.println("StringLength : " + v);
		}

	}

}
 