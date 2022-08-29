package com.hcpark1993.example;

public class SystemOutPrintExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html
	 */
	public static void main(String[] args){
		System.out.println("print texts with new line.");
		System.out.print("Apple"); // No new line
		System.out.print("Banana");
		System.out.println(); // Print new line
		/*
		 * format list: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax
		 */
		System.out.printf("Decimal:%d, Decimal:%d, Hexadecimal: %x, Hexadecimal: %x", 123, 0x123, 0x123, 123);
	}
}
