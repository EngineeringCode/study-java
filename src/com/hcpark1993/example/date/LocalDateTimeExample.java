package com.hcpark1993.example.date;

import java.time.*;
import java.time.format.*;

public class LocalDateTimeExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
	 * https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */
	public static void main(String[] args){
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	
        System.out.println("now.getYear():"+now.getYear());
        System.out.println("now.getMonth():"+now.getMonth());
        System.out.println("now.getDayOfMonth():"+now.getDayOfMonth());
        System.out.println("now.getMonthValue():"+now.getMonthValue());
        System.out.println("now.getDayOfYear():"+now.getDayOfYear());
        System.out.println("now.getDayOfWeek():"+now.getDayOfWeek());
        System.out.println("now.getDayOfWeek().getValue():"+now.getDayOfWeek().getValue());
        
		LocalDateTime nowTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(nowTokyo);
	}
}
