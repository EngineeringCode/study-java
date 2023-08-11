package com.hcpark1993.example.statement;

/*
 * if Statements: https://docs.oracle.com/javase/specs/jls/se17/html/jls-6.html#jls-6.3.2.2
 */
public class IfExample {
	
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		
		if(a == b) {
			System.out.println("변수 a의 값과 변수 b의 값은 같습니다.");
		} else if (a < b) {
			System.out.println("변수 a의 값은 변수 b의 값보다 작은 수 입니다.");
		} else {
			System.out.println("변수 a의 값은 변수 b의 값보다 큰 수 입니다.");
		}
	}
	
}
