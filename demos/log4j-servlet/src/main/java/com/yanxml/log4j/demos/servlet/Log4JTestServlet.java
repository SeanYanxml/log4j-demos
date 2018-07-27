package com.yanxml.log4j.demos.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Log4JTestServlet
 */
@WebServlet("/Log4JTestServlet")
public class Log4JTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(Log4JTestServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Log4JTestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 记录debug级别的信息
		logger.debug("This is debug message.");
		// 记录info级别的信息
		logger.info("This is info message.");
		// 记录error级别的信息
		logger.error("This is error message.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

//http://localhost:8080/log4j-servlet/Log4JTestServlet
//2018-07-27 17:40:34,976 [http-nio-8080-exec-3] DEBUG [com.yanxml.log4j.demos.servlet.Log4JTestServlet] [44] - This is debug message. 
//2018-07-27 17:40:34,979 [http-nio-8080-exec-3] INFO  [com.yanxml.log4j.demos.servlet.Log4JTestServlet] [46] - This is info message. 
//2018-07-27 17:40:34,979 [http-nio-8080-exec-3] ERROR [com.yanxml.log4j.demos.servlet.Log4JTestServlet] [48] - This is error message. 
