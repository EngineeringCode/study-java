package com.hcpark1993.example.statements;

/*
 * for Statements: https://docs.oracle.com/javase/specs/jls/se17/html/jls-6.html#jls-6.3.2.5
 */
public class ForExample {
	
	public static void main(String[] args){
		int a;
		int b;
		
		for(a = 3, b = 4; a <= b ; a = a + 1) {
			System.out.println("변수 a의 현재값: " + a);
			System.out.println("변수 b의 현재값: " + b);
		}
		
		System.out.println("변수 a의 최종값: " + a);
		System.out.println("변수 b의 최종값: " + b);
	}
	
}
