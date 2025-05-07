package com.acorn.day1prac.실습과제;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex04 {
	
	@RequestMapping(value="/printMusic")
	public String musicList(Model model) {
		
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("사랑비","김태우"));
		list.add(new Music("사랑비","김태우"));
		list.add(new Music("사랑비","김태우"));
		list.add(new Music("사랑비","김태우"));
		list.add(new Music("사랑비","김태우"));
		
		model.addAttribute(list);
		
		return null;
	}
	
	
}
