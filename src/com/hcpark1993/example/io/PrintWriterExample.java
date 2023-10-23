package com.hcpark1993.example.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter("example.txt");
		printWriter.println("123456");
		printWriter.println("123456");
		System.out.print("2 rows are written.");
		printWriter.close();
	}
}
