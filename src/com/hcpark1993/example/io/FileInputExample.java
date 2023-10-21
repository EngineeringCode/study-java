package com.hcpark1993.example.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
	/*
	 * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html#err
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("example.txt");
		byte value = (byte) fileInputStream.read();
		System.out.print(value);
	}
}
