package com.example.projeto.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("com.example.projeto.controller")
public class indexController {

	@RequestMapping(value= "/", method=RequestMethod.GET)
	public ModelAndView abrirIndex() {
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
}
