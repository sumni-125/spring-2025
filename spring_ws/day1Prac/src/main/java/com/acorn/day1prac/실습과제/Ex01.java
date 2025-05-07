package com.acorn.day1prac.실습과제;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex01 {
	
	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String calculator(
			@RequestParam (required = false, defaultValue = "0") int su1, 
			@RequestParam (required = false, defaultValue = "0") int su2,
			Model model) {
		System.out.println(su1+su2);
		int sum = su1+su2;
		int sub = su1-su2;
		int mul = su1*su2;
		double divide = (double)su1/su2;
		model.addAttribute("sum", sum);
		model.addAttribute("sub", sub);
		model.addAttribute("mul", mul);
		model.addAttribute("divide", divide);
		
		return "calcView";
	}
	
}
