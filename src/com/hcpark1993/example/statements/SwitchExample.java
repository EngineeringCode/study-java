package com.hcpark1993.example.statements;

/*
 * switch Statements: https://docs.oracle.com/javase/specs/jls/se17/html/jls-6.html#jls-6.3.2.6
 */
public class SwitchExample {
	
	public static void main(String[] args){
		int a = 3;
		
		switch(a) {
			case 3:
				System.out.println("변수 a의 값은 3입니다.");
				break;
			case 4:
				System.out.println("변수 a의 값은 4입니다.");
				break;
			default:
				System.out.println("조건에 일치하는 경우가 없습니다.");
				break;
		}
	}
	
}
