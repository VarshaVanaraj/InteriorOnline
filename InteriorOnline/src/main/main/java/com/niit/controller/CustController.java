package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Customer;
import com.niit.service.CustDAOService;

@Controller
public class CustController {
	@Autowired
	public CustDAOService custDaoService;

	@ModelAttribute("regnForm")
	public Customer construct() {
		return new Customer();
	}


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView showRegister(@ModelAttribute("regnForm") Customer cust, BindingResult result) {
		try {
			custDaoService.addCust(cust);
			custDaoService.saveOrUpdate(cust);
		} catch (Exception e) {
		}
		if (result.hasErrors()) {
			return new ModelAndView("/register");
		} else {
			return new ModelAndView("/home");
		}
	}
}
