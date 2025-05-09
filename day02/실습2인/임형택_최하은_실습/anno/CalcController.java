package com.acorn.prac2.실습2인;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcController {

	@Autowired //생성자 주입
	CalcService s;
	
	@RequestMapping(value = "/calcPrac", method = RequestMethod.GET)
	public String calc(int su1, int su2, Model model) {

		model.addAttribute("add", s.add(su1, su2));
		model.addAttribute("minus", s.minus(su1, su2));
		model.addAttribute("multiply", s.multiply(su1, su2));
		model.addAttribute("divide", s.divide(su1, su2));
		return "pracView";
		
	}
	

	
}
