package com.hcpark1993.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"));
        while(true) {
            String data = bufferedReader.readLine();
            if (data == null) {
            	break; 
            }
            System.out.println(data);
        }
        bufferedReader.close();
	}
}
