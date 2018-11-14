package com.dev.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dev.repo.JDBCImpl;
import com.dev.service.GenerateCurrentDate;

@Controller
@RequestMapping("/controller")
public class HomeController {
//
//	@Autowired
//	JDBCImpl db;
//	
//	@Autowired
//	GenerateCurrentDate date;
//	
//	@ResponseBody
//	@RequestMapping(value= {"/hello","/hello1","/hello2"}, method=
//	{RequestMethod.GET,RequestMethod.POST})
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "Home";
	}

//	@RequestMapping(value="/home", method=RequestMethod.GET)
//	public ModelAndView home(ModelAndView mv){
//		mv.addObject("msg", "ICOMPASS is coming, work hard");
//		mv.setViewName("Home");
//		db.login();
//		System.out.println(date.getDate());
//		return mv;
//	}

}









