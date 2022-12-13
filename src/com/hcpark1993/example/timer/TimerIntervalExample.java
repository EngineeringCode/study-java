package com.hcpark1993.example.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerIntervalExample {
	/*
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Timer.html
	 * 
	 * Perform immediately and repeat every one second.
	 */
	public static void main(String[] args){
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
		    @Override
		    public void run() {
		    	System.out.println("Complete!");
		    }
		};
		timer.schedule(timerTask, 0, 1000);
	}
}
