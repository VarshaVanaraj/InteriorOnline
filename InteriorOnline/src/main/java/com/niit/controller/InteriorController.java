package com.niit.controller;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InteriorController 
{
@RequestMapping("/")
public String ShowIndex()
{
	return "index";
}
@RequestMapping("/home")
public String ShowHome()
{
	return "index";
}
@RequestMapping("/login")
public String ShowLogin()
{
	return "login";
}
@RequestMapping("/register")
public String ShowRegister()
{
	return "register";
}
@RequestMapping("/about")
public String ShowAbout()
{
	return "about";
}
@RequestMapping("/contact")
public String ShowContact()
{
	return "contact";
}
@RequestMapping(value="/product", method=RequestMethod.GET)
public ModelAndView productList()
{
	ModelAndView mod=new ModelAndView("products");
	mod.addObject("pro");
	return mod;
}
}



	 

