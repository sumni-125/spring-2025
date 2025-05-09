package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController3 {
	
	
	BookService service;
	
	
	@Autowired	//세터에다가 오토와이어드 붙이는게 세터주입
	public void setService(BookService service) {
		this.service = service;
	}



	@RequestMapping(value="/book3", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook();
		model.addAttribute("book", book);
		
		return "bookView";
	}
}
