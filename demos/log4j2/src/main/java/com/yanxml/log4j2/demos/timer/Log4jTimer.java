package com.yanxml.log4j2.demos.timer;

import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTimer extends TimerTask{

	static Logger logger = LogManager.getLogger(Log4jTimer.class);
	@Override
	public void run() {
		logger.info("Info Log ,Time:"+System.currentTimeMillis()+".");
	}
	

}
