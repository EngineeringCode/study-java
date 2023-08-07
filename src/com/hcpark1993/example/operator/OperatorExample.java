package com.hcpark1993.example.operator;

/*
 * Operators: https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.12
 */
public class OperatorExample {

	public static void main(String[] args){
		int a=8, b=4, c=2, result;
		
		result = a + b;
		// 12 = 8 + 4
		System.out.println(result);
		
		result = a - b;
		// 4 = 8 - 4
		System.out.println(result);
	
		result = a * b;
		// 32 = 8 * 4
		System.out.println(result);
		
		result = a / b;
		// 2 = 8 * 4
		System.out.println(result);
		
		result = a / b - c;
		// 0 = (8 / 4) - 2
		System.out.println(result);
		
		result = a / (b - c);
		// 4 = 8 / (4 - 2)
		System.out.println(result);
		
		// true의 부정은 false이다.
		System.out.println(!true);
		
		// 주어진 값이 모두 true 이어야만 논리곱의 연산 결과는 true가 된다.
		System.out.println(true&&false);
		
		// 주어진 값 중 하나라도 true 이면 논리합의 연산 결과는 true가 된다.
		System.out.println(true||false);
	}
}
