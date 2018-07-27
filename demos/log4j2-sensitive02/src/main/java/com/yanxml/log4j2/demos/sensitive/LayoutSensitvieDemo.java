package com.yanxml.log4j2.demos.sensitive;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LayoutSensitvieDemo {
	public static Logger logger = LogManager.getLogger(LayoutSensitvieDemo.class);

	public static void main(String[] args) {
		logger.error("Error1 , lkkkkk error2, kkk Error3..");

	}

}

// result
// 2018-07-27 17:01:42,880 [main] ERROR [com.yanxml.log4j2.demos.sensitive.LayoutSensitvieDemo] - Err**1 , lkkkkk Err**2, kkk Err**3.. 

