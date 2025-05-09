package com.acorn.day2.di2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DanController {
	
	@Autowired
	DanService service;//필드주입
	
	
	
	@RequestMapping(value = "/selectDan", method = RequestMethod.GET)
	public String selectDan(@RequestParam(required = false, defaultValue = "2") int num, Model model) {
		
		
		ArrayList<String> dan2List = service.getDan();
		model.addAttribute("dan2",dan2List);
		
		return "dan2";
	}
}
