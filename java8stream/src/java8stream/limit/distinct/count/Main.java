package java8stream.limit.distinct.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> vehiclesList = Arrays.asList("bus","car","bycle","bus","car","car","bike");
	
		// distinct
		List<String>distinctVehicle =	vehiclesList.stream().distinct().collect(Collectors.toList());
		     
	         System.out.println("Main.main() : " + distinctVehicle); // [bus, car, bycle, bike]
	         
	   
	         vehiclesList.stream().distinct().forEach(value->System.out.println(value));
	         
	         
	         
	         // count
	         
	         long count = vehiclesList.stream().distinct().count();
	         System.out.println("Count value : " + count);  // value : 4
	         
	         
	         // limit
	         
	          List<String>  li= vehiclesList.stream().limit(4).collect(Collectors.toList());
	         
	          System.out.println("Limited Vehicles : " + li);  // [bus, car, bycle, bus]
	         
	         
	         
	         
	
	}

}
