package com.hcpark1993.example.statement;

/*
 * do Statements : https://docs.oracle.com/javase/specs/jls/se17/html/jls-6.html#jls-6.3.2.4
 */
public class DoWhileExample {
	
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		
		do {
			System.out.println("변수 a의 현재값: " + a);
			System.out.println("변수 b의 현재값: " + b);
			a = a +1;
		} while(a <= b);
		
		System.out.println("변수 a의 최종값: " + a);
		System.out.println("변수 b의 최종값: " + b);
	}
	
}
