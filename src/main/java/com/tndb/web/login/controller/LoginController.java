package com.tndb.web.login.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/LoginServlet")
	public ModelAndView loginServlet() {
		
		System.out.println("Inside LoginServlet");
		return new ModelAndView("loginServlet");
	}
	
	@RequestMapping(value="/validateLogin", method=RequestMethod.GET)
	public void validateLoginUser() {
		ApplicationContext ctx =
			    new ClassPathXmlApplicationContext("classpath*:*LoginServlet-servlet.xml");
		// Retrieve the data source from the application context
		    DataSource ds = (DataSource) ctx.getBean("dataSource");
		// Open a database connection using Spring's DataSourceUtils
		Connection c = DataSourceUtils.getConnection(ds);
		System.out.println("Connection "+ c);
		System.out.println("Inside Validate Login");
 
		
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public void registerUser() {
		/*ApplicationContext ctx =
			    new ClassPathXmlApplicationContext("LoginServlet-servlet.xml");
		// Retrieve the data source from the application context
		    DataSource ds = (DataSource) ctx.getBean("dataSource");
		// Open a database connection using Spring's DataSourceUtils
		Connection c = DataSourceUtils.getConnection(ds);
		System.out.println("Inside Validate Login");*/
 
		
	}


}
