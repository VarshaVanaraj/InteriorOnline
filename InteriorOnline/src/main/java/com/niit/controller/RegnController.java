package com.niit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.niit.model.RegnModel;
import com.niit.service.RegnService;

@Controller
public class RegnController {
    
    @Autowired
    private RegnService RegnService;
 
  /*  @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("RegnForm", "regn", new RegnModel());
    }
 
    @RequestMapping(value = "/UserRegn", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("RegnForm")RegnModel reg, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "index";
        }
        model.addAttribute("name", reg.getName());
        model.addAttribute("email", reg.getEmail());
        model.addAttribute("pwd", reg.getPwd());
        return "login";
    }
}*/
    
    
    @RequestMapping("/registern")
    public String listUsers(Map<String, Object> map) {
        map.put("reg", new RegnModel());
        map.put("regList", RegnService.listUsers());
        return "reg";
    }
 
    @RequestMapping(
        value = "/registern",
        method = RequestMethod.POST
    )
    public String addUser(@ModelAttribute("RegnForm")
        RegnModel reg, BindingResult result)
    {
        if(null == reg.getId()) {
            RegnService.addUser(reg);    
        }
        else {
            RegnService.updateUser(reg);
        }
        return "redirect:/index";
    }
 
 /*  @RequestMapping("/delete/{UserId}")
    public String deleteUser(
        @PathVariable("UserId") Integer UserId)
    {
        RegnService.removeUser(UserId);
        return "redirect:/index";
    }
 
    @RequestMapping("/edit/{UserId}")
    public String editUser(
        @PathVariable("UserId")Integer UserId,
        Map<String, Object> map)
    {
        map.put("reg", RegnService.getUserById(UserId));
        map.put("UserList", RegnService.listUsers());
        return "reg";
    }*/
}
