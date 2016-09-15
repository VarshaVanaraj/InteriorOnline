package com.niit.controller;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	
	@RequestMapping("/loginbtn")
	public ModelAndView loginPg()
	{
		ModelAndView mo=new ModelAndView("loginpg");
		mo.addObject("msg","login success!!");
		return mo;
	}
}
