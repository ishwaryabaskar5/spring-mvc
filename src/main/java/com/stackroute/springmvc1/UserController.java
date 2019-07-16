package com.stackroute.springmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	User user;
	
	@RequestMapping(value = "/")
	public ModelAndView greet(){
		ModelAndView modelAndView = new ModelAndView("greet.jsp");
		modelAndView.addObject("result","Welcome to stackroute "+user.getName());
		return modelAndView;
	}
}
