package com.acorn.day1prac.실습과제;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex03 {
	
	@RequestMapping(value="/dan", method = RequestMethod.GET)
	public String choiceDan(@RequestParam (required = false, defaultValue = "0") int num, Model model) {
		model.addAttribute("num",num);
		return "choice_view";
	}
	
}
