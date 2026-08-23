package java8stream.filter.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMateDemo3 { // Note: You might want to rename the class to FlatMapDemo3 to fix the typo
	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Scott", "David", "John");
		List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");
		
		List<List<String>> playrsInWordCup = new ArrayList<List<String>>();
		playrsInWordCup.add(teamA);
		playrsInWordCup.add(teamB);
		playrsInWordCup.add(teamC);
		
		// 1. Before Java 8: Using nested loops
		System.out.println("--- Reading names using traditional nested loops ---");
		for(List<String> team : playrsInWordCup)
		{
			for(String name : team) {
				System.out.println(name);
			}
		}
		
		// 2. Using Java 8 Stream API with flatMap()
		System.out.println("\n--- Processing names using Java 8 flatMap() ---");
		
		// Unpacks each nested list of teams and flattens them into a single List of Strings
		List<String> flatNamesList = playrsInWordCup.stream()
				                                    .flatMap(team -> team.stream())
				                                    .collect(Collectors.toList());
		
		System.out.println("Flattened World Cup Players List: " + flatNamesList);
		
		// Alternate Java 8 approach: Printing each element directly from the stream without collecting
		// System.out.println("\n--- Printing directly from stream ---");
		// playrsInWordCup.stream().flatMap(team -> team.stream()).forEach(System.out.println);
	}
}
