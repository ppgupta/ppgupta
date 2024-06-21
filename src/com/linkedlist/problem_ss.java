package com.linkedlist;

import java.util.Iterator;

public class problem_ss {
//selection sort
	
	private static void sort(int []array ) {
		int n=array.length;
		
		for (int i = 0; i < n-1; i++) {
            int minIndex = i;
			
			for (int j = i+1; j < n; j++) {
				if (array[j]<array[minIndex]) {
					
                minIndex=j;					
				}
			}
			
			int tmp= array[i];
			array[i]=array[minIndex];
			array[minIndex]=tmp;
		}
		
	}
	public static void main(String[] args) {
		
//		int[] arr = {64, 25, 12, 22, 11};
	    int []arr={12,6,11,1,5,0};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
	
}
