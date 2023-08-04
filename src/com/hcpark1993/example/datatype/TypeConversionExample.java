package com.hcpark1993.example.datatype;

/*
 * Chapter 5. Conversions and Contexts: https://docs.oracle.com/javase/specs/jls/se17/html/jls-5.html
 */
public class TypeConversionExample {

	public static void main(String[] args){
		float floatValue = 100.0f;
		int intValue = 100;
		
		if(floatValue == (float) intValue) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		String stringValue = "100";
		
		if(stringValue.equals(intValue)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		String stringConvert = String.valueOf(intValue);
		if(stringValue.equals(stringConvert)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		int intConvert = Integer.parseInt(stringValue);
		if(intValue == intConvert) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
}
