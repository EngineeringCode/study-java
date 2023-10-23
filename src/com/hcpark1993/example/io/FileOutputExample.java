package com.hcpark1993.example.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
	/*
	 * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html#err
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("example.txt");
		byte value = 32;
		fileOutputStream.write(value);
		System.out.print(value + " is written.");
		fileOutputStream.close();
	}
}
