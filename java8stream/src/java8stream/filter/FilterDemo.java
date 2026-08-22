package java8stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		
     List<String> names = Arrays.asList("Melisandre", "Sansa","Jon","Daenerys","Joffery");
     List<String>longnames = new ArrayList<String>();
     
     // types - 1
     /*
     longnames = names.stream().filter(str->str.length()>6 && str.length() < 8).collect(Collectors.toList());
     System.out.println("FilterDemo.main() : " + longnames);
     */
     
     // types - 2
     names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
	}

}
