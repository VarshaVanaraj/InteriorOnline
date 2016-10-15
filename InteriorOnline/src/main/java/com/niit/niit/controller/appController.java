package com.niit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Customer;
import com.niit.model.Product;
import com.niit.services.ProductServices;
import com.niit.services.custServices;

@Controller
public class appController {
	
	/*Customer controller*/
	@Autowired
	private custServices cust_services;
	
	@RequestMapping("/register")
	public String ShowRegister() {
		return "register";
	}
	
	@ModelAttribute("regForm")
	public Customer getCust(){
		return new Customer();
	}
	
	@RequestMapping(value = "/register_", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("regForm") Customer customer, BindingResult Result){
		
		try{
			cust_services.addCustomer(customer);
		}catch(Exception e){
			
		}
		
		if(Result.hasErrors()){
			return new ModelAndView("/register");
		}
		else{
			return new ModelAndView("/index");
		}
	}
	
	@RequestMapping(value="/updCust",method=RequestMethod.POST)
	public ModelAndView updateCustomer(@ModelAttribute("updateCust") Customer customer,BindingResult Result){
		cust_services.updateCustomer(customer);
		return new ModelAndView("/viewCust");
	}
	
	@RequestMapping(value="/delCust",method=RequestMethod.POST)
	public ModelAndView deleteCustomer(@ModelAttribute("deleteCust") Customer customer,BindingResult Result){
		cust_services.deleteCustomer(customer);
		return new ModelAndView("/viewCust");
	}
	
	@RequestMapping(value="/viewCust",method=RequestMethod.GET)
	public String viewCustomer(Model model){
		
		model.addAttribute("customer",new Customer());
		model.addAttribute("cmr",this.cust_services.viewCustomer());
		return "UserRegn";
	}
	
	/*product controller*/
	@Autowired
	private ProductServices pdt_services;
	
	@ModelAttribute("pdtForm")
	public Product getPdt(){
		return new Product();
	}
	
	@RequestMapping("pdtAdmn")
	public String ShowPdt(){
		return "ProductAdmin";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("pdtForm") Product product, BindingResult Result){
		
		try{
			pdt_services.addProduct(product);
		}catch(Exception e){
			
		}
		
		if(Result.hasErrors()){
			return new ModelAndView("/addProduct");
		}
		else{
			return new ModelAndView("/admin");
		}
	}
	/*
	
	@RequestMapping(value="/updPdt",method=RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute("updatePdt") Product product,BindingResult Result){
		pdt_services.updateProduct(product);
		return new ModelAndView("/viewpdt");
	}
	
	@RequestMapping(value="/delPdt",method=RequestMethod.POST)
	public ModelAndView deleteProduct(@ModelAttribute("deletePdt") Product product,BindingResult Result){
		pdt_services.deleteProduct(product);
		return new ModelAndView("/viewpdt");
	}
	
	@RequestMapping(value="/viewPdt",method=RequestMethod.GET)
	public String viewProduct(Model model){
		System.out.println(this.pdt_services.viewProduct());
		model.addAttribute("product",new Product());
		model.addAttribute("pdt",this.pdt_services.viewProduct());
		return "products";
	}*/
	
}

