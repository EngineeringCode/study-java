package com.hcpark1993.example;

public class SystemOutPrintExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html
	 */
	public static void main(String[] args){
		String stringSample = "sample";
		int intSample = 1;
		double doubleSample = 1.12;
		
		System.out.println("print texts with new line.");
		System.out.println("print texts with new line. "+stringSample+" "+intSample+" "+doubleSample);
		System.out.print("Apple"); // No new line
		System.out.print("Banana"+intSample);
		System.out.println(); // Print new line
		/*
		 * format list: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax
		 * '\r' and '\n' are new line keywords.
		 */
		System.out.printf("Decimal:%d, Decimal:%d, Hexadecimal: %x, Hexadecimal: %x \r\n", 123, 0x123, 0x123, 123);
		System.out.printf("String: %s, Decimal:%d, Decimal floating point: %f", stringSample, intSample, doubleSample);
	}
}
