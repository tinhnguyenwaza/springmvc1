package com.crunchify.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class CrunchifyHelloWorld {
 
	@RequestMapping("/login")
	public ModelAndView helloWorld() {	
		return new ModelAndView("login");
	}
	
	@RequestMapping("/checkLogin")
	public ModelAndView helloWorld1(HttpServletRequest request, HttpServletResponse reponse) {
 
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		if(userName !=  null && passWord != null) {
			if(userName.equalsIgnoreCase("tinh") && passWord.equalsIgnoreCase("1234")) {
				return new ModelAndView("welcome", "name", userName);
			} else {
				return new ModelAndView("login", "error", "username or  pass word no exacly");
			}
			
		}
		return new ModelAndView("login", "error", "username or  pass word no space");
	}
}
