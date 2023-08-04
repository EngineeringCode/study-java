package com.hcpark1993.example.timer;

import java.util.Timer;
import java.util.TimerTask;
/*
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Timer.html
 */ 
public class TimerDelayExample {
	/* 
	 * 1초 후에 수행한다.
	 * Perform after 1000 ms.
	 */
	public static void main(String[] args){
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
		    @Override
		    public void run() {
		    	System.out.println("Complete!");
		    }
		};
		timer.schedule(timerTask, 1000);
	}
}
