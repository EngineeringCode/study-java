package com.hcpark1993.example.system;

/*
 * https://docs.oracle.com/en/java/javase/17/docs/api/index.html#currentTimeMillis--
 */ 
public class ProcessingTimeExample {
	/* 
	 * 두 코드 사이에 소요된 처리 시간을 측정한다.
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
