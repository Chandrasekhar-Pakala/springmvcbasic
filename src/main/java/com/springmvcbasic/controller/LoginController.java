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
public class LoginController {

	@Autowired
	 private UserService userService;
	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	 public String login() {
	     return "login/login";
	 }
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	 public ModelAndView authenticate(@ModelAttribute("user") User user,ModelMap map) {
		 String view ="login/login";
		 boolean isValidUser = userService.authenticate(user.getLogonId(), user.getPassword());
		 System.out.println("User authenticated -->"+isValidUser);
		 map.addAttribute("auth", isValidUser);
		 if(isValidUser) {
			 User userBean = userService.getUser(user.getLogonId());
			 System.out.println("User  -->"+userBean.getFirstName());
			 map.addAttribute("UserBean", userBean);
			 view = "home/dashboard";
		 }
		 return new ModelAndView(view, "status", map);
	 }
}
