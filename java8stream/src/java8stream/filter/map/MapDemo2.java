package java8stream.filter.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
public static void main(String[] args) {
	List<String>vehicles = Arrays.asList("bus","car","bucycle","flight","train");
	
	/*
	// before java8/without using stream
	for(String name:vehicles) 
	{
		System.out.println("MapDemo2.main() : " + name.length());
	}
	*/
	
	// using streams
	// vehicles.stream().map(name->name.length()).forEach(len->System.out.println(len));
	
	vehicles.stream().map(name->name.length()).forEach(System.out::println);
}
}
