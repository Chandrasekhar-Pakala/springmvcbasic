package com.springmvcbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcbasic.model.User;
import com.springmvcbasic.services.UserService;

@Controller
public class RegistrationController {
	
	 @Autowired
	 private UserService userService;
	 
	 @RequestMapping(value = "/regform", method = RequestMethod.GET)
	 public String showRegister(ModelMap map) {
	     return "registration/regform";
	 }
	 
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public ModelAndView addUser(ModelMap map, @ModelAttribute("user") User user) {
		 boolean status = userService.register(user);
		 map.addAttribute("status", status);
		 System.out.println("User First Name :"+ user.getFirstName());
		 map.addAttribute("user", user);
		 return new ModelAndView("regstatus", "status", map);
	 }
}
