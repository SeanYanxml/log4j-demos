package com.yanxml.log4j2.demos.origin;

import org.apache.logging.log4j.LogManager;

//import java.util.logging.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/**
 * The first demo to show the log4j2.
 * Author Sean
 * Date 20180529
 * */

public class HelloWroldLog4j2 {
	public static Logger logger = LogManager.getLogger(HelloWroldLog4j2.class);

//	Logger logger = LogManager.getLogger(this.getClass().getName());
	public static void main(String[] args) {
		System.out.println("System Out: HelloWorld!");
		
		logger.trace("Logger Level: TRACE");		
		logger.debug("Logger Level: DEBUG");
		logger.info("Logger Level: INFO");
		logger.warn("Logger Level: WARN");
		logger.error("Logger Level: ERROR");
		logger.fatal("Logger Level: FATAL");

	}

}
