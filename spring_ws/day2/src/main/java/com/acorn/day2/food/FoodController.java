package com.acorn.day2.food;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodController {
	
	//메서드단위
	@RequestMapping(value ="/food", method =RequestMethod.GET)
	public String getFood(Model model) {
		
		// 추천음식 가져오기
		String food = "라면";
		model.addAttribute("food",food);
		
		return "foodView";
	}
	
}
