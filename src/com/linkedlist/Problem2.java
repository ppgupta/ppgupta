package com.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
	
	public List<Integer> duplicate(ArrayList<Integer> input){
		List<Integer> output= new ArrayList<>();

//		output= input
//				.stream()
//				.filter(ans-> input.indexOf(ans) != input.lastIndexOf(ans)
//		).distinct()
//				.collect(Collectors.toList());
				
//		
				output = input.stream()
                .filter(i -> input.indexOf(i) == input.lastIndexOf(i)) // Filter duplicates
//                .distinct() // Keep distinct duplicates
                .collect(Collectors.toList()); // Collect into List
//return output;
		return output;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input= new ArrayList<>();
		
		// 1 2 3 1 1 2 4 5 6 5
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(1);
		input.add(1);
		input.add(2);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(5);

		Problem2 obj = new Problem2();
		
		System.out.print(obj.duplicate(input));
	}

}
