package com.stackroute.springmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	User user;
	
	@Autowired
	public UserController(User user) {
		this.user = user;
	}
	
	@RequestMapping(value = "/")
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView("login.jsp");
		modelAndView.addObject("result","Welcome to stackroute ");
		return modelAndView;
	}
	
	@RequestMapping(value = "/greet", method = RequestMethod.POST)
	public ModelAndView greet(@RequestParam("username") String username, @RequestParam("password") String password){
		user.setUsername(username);
		user.setPassword(password);
		ModelAndView modelAndView = new ModelAndView("greet.jsp");
		modelAndView.addObject("result",user.getUsername());
		return modelAndView;
	}
}
