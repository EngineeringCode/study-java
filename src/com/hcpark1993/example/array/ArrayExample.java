package com.hcpark1993.example.array;

/*
 * Array Types: https://docs.oracle.com/javase/specs/jls/se17/html/jls-10.html#jls-10.1
 */
public class ArrayExample {
	
	public static void main(String[] args){
		int[] oneDimensionArray = {1, 2, 3, 4, 5};
		for(int i=0; i<oneDimensionArray.length; i++) {
			System.out.print(oneDimensionArray[i] + " ");
		}
		System.out.println();

		int[][] twoDimensionArray = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		for(int i=0; i<twoDimensionArray.length; i++) {
			for(int j=0; j<twoDimensionArray[0].length; j++) {
				System.out.print(twoDimensionArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
