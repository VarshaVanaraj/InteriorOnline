package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "register")
public class CustController {
	@RequestMapping(value = "/regnForm", method = RequestMethod.GET)
	public ModelAndView addCust() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

}
