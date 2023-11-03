package com.hcpark1993.example.math;

import java.io.IOException;

public class FactorialRecursiveExample {
	/*
	 * 팩토리얼을 재귀함수로 구현하는 예제
	 */
	public static void main(String[] args) throws IOException{
		System.out.println(factorial(5));
	}
	
	static long factorial(long n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
