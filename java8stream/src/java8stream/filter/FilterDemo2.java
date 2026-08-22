package java8stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("cup", null, "forest","sky","book",null,"theatre");
		List<String> result = words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println("FilterDemo2.main() : " + result);
	}

}
