package com.hcpark1993.example.constant;

/*
 * Field (Constant) Declarations: https://docs.oracle.com/javase/specs/jls/se17/html/jls-9.html#jls-9.3
 */
public class ConstantExample {
	static enum Seasons {
		SPRING, SUMMER, FALL, WINTER
	}
	
	public static void main(String[] args){
		Seasons season = Seasons.SPRING;
		
		switch (season) {
			case SPRING: {
				System.out.println("봄입니다.");
				break;
			}
			case SUMMER: {
				System.out.println("여름입니다.");
				break;
			}
			case FALL: {
				System.out.println("가을입니다.");
				break;
			}
			case WINTER: {
				System.out.println("겨울입니다.");
				break;
			}
		}
	}
}
