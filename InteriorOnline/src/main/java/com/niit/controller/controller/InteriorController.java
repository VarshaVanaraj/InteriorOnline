package com.niit.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class InteriorController {
	@RequestMapping("/")
	public String ShowIndex(){
		return "index";
	}
	
	@RequestMapping("/home")
	public String ShowHome() {
		return "index";
	}

	
	@RequestMapping("/admin")
	public String ShowAdmin() {
		return "admin";
	}


	@RequestMapping("/login")
	public String ShowLogin() {
		return "login";
	}


	@RequestMapping("/about")
	public String ShowAbout() {
		return "about";
	}

	@RequestMapping("/contact")
	public String ShowContact() {
		return "contact";
	}
}
