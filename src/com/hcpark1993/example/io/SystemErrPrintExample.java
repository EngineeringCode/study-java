package com.hcpark1993.example.io;

import java.io.IOException;

public class SystemErrPrintExample {
	/*
	 * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html#err
	 */
	public static void main(String[] args) throws IOException{
		System.err.println("오류가 발생했습니다.");
	}
}
