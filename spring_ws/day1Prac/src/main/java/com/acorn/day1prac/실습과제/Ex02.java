package com.acorn.day1prac.실습과제;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex02 {
	
	@RequestMapping(value = "/dan3", method = RequestMethod.GET)
	public String dan3() {
		
		return "dan3View";
	}
}
