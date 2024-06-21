package com.linkedlist;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem3 {
	
	public List<Integer> duplicate(ArrayList<Integer> input){
		Set<Integer> unique=new HashSet<>();
		List<Integer> output =new ArrayList<>();
//		for (Integer number : input) {
//			if (!unique.add(number) ) {
//				// If number is already in the set, it's a duplicate
//				if(!output.contains(number)) {
//				
//				output.add(number);
//			}}
//		}
		
		 output = input.stream()
		                            .filter(i -> unique.add(i)) // Filter duplicates
		                            .distinct() // Keep distinct duplicates
		                            .collect(Collectors.toList()); // Collect into List
		return output;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		// 1 2 3 1 1 2 4 5 6 5
		input.add(1);
		input.add(2);
		input.add(3);
//		input.add(3);
//		input.add(3);
//		input.add(3);

		input.add(1);
		input.add(1);
		input.add(2);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(5);

		Problem3 obj = new Problem3();
		
		System.out.println(obj.duplicate(input)); // Output: [1, 2, 5]
	}
}
