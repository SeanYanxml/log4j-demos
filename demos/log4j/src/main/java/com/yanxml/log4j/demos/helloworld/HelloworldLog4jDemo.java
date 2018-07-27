package com.yanxml.log4j.demos.helloworld;

import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class HelloworldLog4jDemo {
	private static Logger logger = Logger.getLogger(HelloworldLog4jDemo.class);  

    /** 
     * @param args 
     */  
    public static void main(String[] args) {  

//    	BasicConfigurator.configure ()： 自动快速地使用缺省Log4j环境。  
//    	PropertyConfigurator.configure ( String configFilename) ：读取使用Java的特性文件编写的配置文件。  
//    	DOMConfigurator.configure ( String filename ) ：读取XML形式的配置文件。
    	
//    	BasicConfigurator.configure();// default & realpath
//    	PropertyConfigurator.configure("");//property file path
//    	DOMConfigurator.configure("");// xml file path
    	
        // System.out.println("This is println message.");  

        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
    }  

}
