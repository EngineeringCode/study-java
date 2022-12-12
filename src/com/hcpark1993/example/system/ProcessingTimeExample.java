package com.hcpark1993.example.system;

public class ProcessingTimeExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#currentTimeMillis--
	 * 
	 * Measure processing time between targeted code.
	 */
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		for(int i=0; i<Integer.MAX_VALUE;i++) {
			double a = Math.random();
			double b = Math.random();
			double c = a+b;
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		
		System.out.println("Complete! "+ diff+" ms");
	}
}
