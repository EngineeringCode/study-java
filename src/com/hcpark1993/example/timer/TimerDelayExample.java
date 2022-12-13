package com.hcpark1993.example.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDelayExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Timer.html
	 * 
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
