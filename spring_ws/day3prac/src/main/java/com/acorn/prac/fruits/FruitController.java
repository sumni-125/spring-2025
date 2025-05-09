package com.acorn.prac.fruits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acorn.prac.Member;

@Controller
public class FruitController {
	
	@Autowired
	FruitRepository repository;
	
	@RequestMapping(value="/selectFruits", method=RequestMethod.GET)
	public String selectAll() {
		List<Fruit> list = repository.selectAll();
		System.out.println(list);
		return "fruits";
	}
	
	@RequestMapping(value="/selectFruit", method=RequestMethod.GET)
	public String selectOne() {
		Fruit f = repository.selectOne("Banana");
		System.out.println(f);
		return "fruits";
	}
	
	@RequestMapping(value="/insertFruit", method=RequestMethod.GET)
	public String  insert( @ModelAttribute  Fruit f) {		
		int result  =repository.insert(f) ;
		System.out.println( result);	
		
		return "fruits";
		
	}
	
	@RequestMapping(value="/updateFruit", method=RequestMethod.GET)
	public String  update( @ModelAttribute  Fruit f) {		
		int result  =repository.update(f) ;
		System.out.println( result);	
		
		return "fruits";
		
	}
	
	@RequestMapping(value="/deleteFruit", method=RequestMethod.GET)
	public String delete(@RequestParam String fruit_name) {
		int result = repository.deleteOne(fruit_name);
		System.out.println(result);
		
		return "fruits";
	}
	
	
}
