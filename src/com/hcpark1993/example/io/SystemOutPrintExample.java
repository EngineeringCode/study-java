package com.hcpark1993.example.io;

public class SystemOutPrintExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html
	 * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html#out
	 */
	public static void main(String[] args){
		System.out.println("개행문자와 함께 입력된 값을 출력한다.");
		System.out.print("개행문자 없이");
		System.out.print("입력된 값을 출력한다.");
		/* \r\n 은 개행문자이다. */
		System.out.print("\r\n");
		
		/* 변수 출력 */
		String stringSample = "예제";
		int intSample = 1;
		double doubleSample = 1.12;
		
		System.out.println("개행문자와 함께 입력된 값을 출력한다. "+stringSample+" "+intSample+" "+doubleSample);
		System.out.print("바나나 "+intSample+"개");
		System.out.println(); // 개행한다.
		System.out.printf("십진수 출력: %d \r\n", intSample);
		
		/*
		 * 형식 목록: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax
		 * '\r'과 '\n', '\r\n'은 개행문자입니다.
		 */
		System.out.printf("십진수:%d, 십진수:%d, 16진수: %x, 16진수: %x \r\n", 123, 0x123, 0x123, 123);
		System.out.printf("문자열: %s, 십진수:%d, 십진수 부동 소수점: %f", stringSample, intSample, doubleSample);
	}
}
