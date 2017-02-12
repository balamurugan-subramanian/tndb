package com.tndb.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/LoginServlet")
	public ModelAndView LoginServlet() {
		return new ModelAndView("loginServlet");
	}
	
	@RequestMapping(value="/validateLogin", method=RequestMethod.GET)
	public void ValidateLoginUser() {
		System.out.println("Inside Validate Login");
 
		
	}


}
