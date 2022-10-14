package com.hcpark1993.example.array;

public class RotateArrayExample {
	
	
	public static void main(String[] args){
		int[][] array = new int[][]{
			{0,1,2,3,4},
			{5,6,7,8,9},
			{10,11,12,13,14},
			{15,16,17,18,19},
			{20,21,22,23,24},
			{25,26,27,28,29}
		};
		System.out.println("원본:");
		print2DArray(array);
		
		System.out.println("시계방향으로 90도 회전:");
		array = rotateClockWise90Degree(array);
		print2DArray(array);
	}
	
	static int[][] rotateClockWise90Degree(int[][] array) {
		int[][] temporalArray = new int[array[0].length][array.length];
		for(int y=0; y<array.length; y++) {
			for(int x=0; x<array[0].length; x++) {
				temporalArray[x][array.length-y-1] = array[y][x];
			}
		}
		return temporalArray;
	}
	
	static void print2DArray(int[][] array) {
		for(int[] arr:array) {
			for(int a:arr) {
				System.out.printf(" %3d ", a);
			}
			System.out.println();
		}
	}
}
