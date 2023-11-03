package com.hcpark1993.example.date;

import java.time.*;
import java.time.format.*;

public class DateTimeFormatterExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
	 * https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */
	public static void main(String[] args){
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String nowFormatted = now.format(format);
        System.out.println(nowFormatted);
	}
}
