package com.hcpark1993.example.io;

import java.io.IOException;

public class SystemInReadExample {
	/*
	 * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html#in
	 */
	public static void main(String[] args) throws IOException{
		int variable = System.in.read();
		System.out.println(variable);
	}
}
