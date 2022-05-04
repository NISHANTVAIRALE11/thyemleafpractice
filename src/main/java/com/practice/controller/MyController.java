package com.practice.controller;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.entity.LoginData;

@Controller
public class MyController {
	
	@RequestMapping("/form")
	public String form(Model m) {
		
		m.addAttribute("loginData",new LoginData());
		return "form";
	}
   
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String login(@Valid@ModelAttribute ("loginData") LoginData loginData,BindingResult result,Model m) {
		m.addAttribute("login","hello");
		
		if(result.hasErrors()) {
			return "form";
			
		}
		System.out.println(result);
		System.out.println(loginData);
		   return "success";
	}
	
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String handler(Model model) {
		
		model.addAttribute("name","nishant vairale");
		model.addAttribute("date", new Date().toLocaleString());
		
		List<String> lists=List.of("nishant","aniket","nikhil","akshay");
		model.addAttribute("list",lists);
		
		model.addAttribute("gender","m");
		model.addAttribute("isActive",true);
		
		List<Integer> list1=List.of(1);
		
		model.addAttribute("mylist",list1);
		
		return "about";
	}
	
	  
	@RequestMapping("/base")
	  public String base(Model m) {
		
		m.addAttribute("title","i am nishant");
		m.addAttribute("subtitle",LocalDateTime.now());
		  return "base";
	  }
	@RequestMapping("/base1")
	  public String base1(Model m) {
		
		m.addAttribute("title","i am nishant");
		m.addAttribute("subtitle",LocalDateTime.now());
		  return "base1";
	  }
}


