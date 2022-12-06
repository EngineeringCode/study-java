package com.hcpark1993.example.sort;

import java.util.Arrays;

public class BubbleSortExample {
	static int[] data = new int[] {6, 9, 3, 4, 8, 2, 7, 5, 1};
	
	public static void main(String[] args){
		bubbleSort();
	}
	
	static void bubbleSort() {
		for(int i=data.length-1; i>0; i--) {
			System.out.println(Arrays.toString(data));
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) {
					int tempVariable = data[j];
					data[j] = data[j+1];
					data[j+1] = tempVariable;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
