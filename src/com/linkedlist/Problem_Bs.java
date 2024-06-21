package com.linkedlist;

public class Problem_Bs {
	
	private static void sort(int []array) {
		int n =array.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if (array[j]>array[j+1]) {
					int tmp=array[j];
					 array[j]= array[j+1];
					 array[j+1]=tmp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11,0};

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