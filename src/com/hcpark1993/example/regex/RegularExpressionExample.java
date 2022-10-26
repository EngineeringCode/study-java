package com.hcpark1993.example.regex;

import java.util.*;
import java.util.regex.*;

public class RegularExpressionExample {
	public static void main(String[] args){		
		String value = "ABCDEFGabcd.  .efg123!@#";
		
		System.out.println(value);
		System.out.println(allowOnlyNumberAlphabet(value));
		System.out.println(allowOnlyNumberAlphabetDot(value));
		System.out.println(isEmailAddress(value));
		System.out.println(removeContinuousSpace(value));
	}
	
	public static String allowOnlyNumberAlphabet(String value) {
		// 영어 대문자, 영어 소문자, 숫자만 허용
		String regex = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
		return value.replaceAll(regex, " ");
	}
	
	public static String allowOnlyNumberAlphabetDot(String value) {
		// 영어 대문자, 영어 소문자, 숫자만 허용
		String regex = "[^\uAC00-\uD7A3xfe0-9a-zA-Z.\\s]";
		return value.replaceAll(regex, " ");
	}
	
	public static boolean isEmailAddress(String value){
		Pattern pattern = Pattern.compile("\\w+[@]\\w+\\.\\w+");
		Matcher match = pattern.matcher(value);
		return match.find();
	}
	
	public static String removeContinuousSpace(String value){
		String regex = "\\s{2,}";
		return value.replaceAll(regex, " ");
	}
}
