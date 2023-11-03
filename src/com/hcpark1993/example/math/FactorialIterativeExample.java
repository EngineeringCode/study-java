package com.hcpark1993.example.math;

import java.io.IOException;

public class FactorialIterativeExample {
	/*
	 * 팩토리얼을 반복문으로 구현하는 예제
	 */
	public static void main(String[] args) throws IOException{
		System.out.println(factorial(5));
	}
	
	static long factorial(int n) {
		long result = 1;
		for(long i=2; i<=n; i++) {
			result *= i;
		}
		return result;
	}
}
