package java8stream.filter.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String>vehicles = Arrays.asList("bus","car","bucycle","flight","train");
		List<String>vehicleUpeerCase = new ArrayList<String>();
		
		/*
		// before java8/ without using stream
		for(String name : vehicles) {
			vehicleUpeerCase.add(name.toUpperCase());
		}
		System.out.println("MapDemo1.main(): " + vehicleUpeerCase);
   */
		
		vehicleUpeerCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("MapDemo1.main(): " + vehicleUpeerCase);
	}

}
