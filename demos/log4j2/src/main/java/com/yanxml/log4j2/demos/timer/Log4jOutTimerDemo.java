package com.yanxml.log4j2.demos.timer;

import java.util.Timer;

/**
 * Set the timer to uptdae the xx.log .
 * 
 * */
public class Log4jOutTimerDemo {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Log4jTimer(),1,1);
	}

}
