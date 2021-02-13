package com.proyecto.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView index(){
	//	String response = "Bienvenido a <a href='http://www.google.com'>google.com</a> :)";
	//	return response;
		ModelAndView index = new ModelAndView("index");
		return index; 
	}
}
