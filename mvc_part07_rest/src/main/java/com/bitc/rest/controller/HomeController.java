package com.bitc.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@GetMapping("responseData")
	public String resData() {
		return "resData";
	}
	
	@GetMapping("javascript")
	public void javascript() {}
	
	@GetMapping("ajaxTest")
	public String ajaxTest() {
		return "ajax";
	}
	
	
	
	
	
}












