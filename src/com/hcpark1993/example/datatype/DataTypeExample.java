package com.hcpark1993.example.datatype;

/*
 * Variables: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 * Primitive Data Types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class DataTypeExample {

	public static void main(String[] args){
		// 정수, -128 ~ 127
		byte byteValue = -128;
		System.out.println("byteValue: " + byteValue);
		
		// 정수, -32,768 ~ 32,767
		short shortValue = -32768;
		System.out.println("shortValue: " + shortValue);
		
		// 정수, -2,147,483,648 ~ 2,147,483,647
		int intValue = -2147483648;
		System.out.println("intValue: " + intValue);
		
		// 정수, -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long longValue = -9223372036854775808L;
		System.out.println("longValue: " + longValue);
		
		// 실수, (유효 자릿수) 소수 6자리
		float floatValue = -128.12345f;
		System.out.println("floatValue: " + floatValue);
		floatValue = -128.123456f;
		System.out.println("floatValue: " + floatValue);
		
		// 실수, (유효 자릿수) 소수 15자리
		double doubleValue = -128.1234567890123d;
		System.out.println("doubleValue: " + doubleValue);
		doubleValue = -128.12345678901234d;
		System.out.println("doubleValue: " + doubleValue);
		
		// 논리, 진실(true) 또는 거짓(false)
		boolean booleanValue = true;
		System.out.println("booleanValue: " + booleanValue);
		
		// 문자, -128 ~ 127
		char charValue = 'P';
		System.out.println("charValue: " + charValue);
		charValue = 80;
		System.out.println("charValue: " + charValue);
		
		// 문자열
		String stringValue = "가나다라마바사아자차카파타하";
		System.out.println("stringValue: " + stringValue);
	}
}
