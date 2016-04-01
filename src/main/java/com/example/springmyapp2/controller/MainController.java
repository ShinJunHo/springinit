package com.example.springmyapp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	public MainController(){
		System.out.println(" Controller init() ");
	}

	@RequestMapping("/hello")
	public String hello(){
		
		System.out.println("Hello Console");
		return "/index.jsp";
	}
}
