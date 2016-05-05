package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class cont 
{
	
	@RequestMapping("/")
	public String showMessage() 
	{
			return "index";
	}

}
