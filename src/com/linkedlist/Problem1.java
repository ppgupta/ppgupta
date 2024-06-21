package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
	
	public ArrayList<Integer> duplicate(ArrayList<Integer> input){
		ArrayList<Integer> output= new ArrayList<>();
		List<Integer> input2= new ArrayList<>();

		
		for (Integer answer : input) {
			
//			if(input.indexOf(answer)!=input.lastIndexOf(answer)) {
//				output.add(answer);
//			}
			input2=input.subList(input.indexOf(answer)+1, input.size());
			if(input2.contains(answer)) {
				if(!output.contains(answer))
				output.add(answer);
			}
		}
//		isPresent()
//		input.stream().filter(x->({
//			.Collect(toList)
//		}))
//		
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

		Problem1 obj = new Problem1();
		
		System.out.print(obj.duplicate(input));
	}

}
