package com.acorn.prac;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	@Autowired
	MemberRepository repository;
	
	@RequestMapping(value="/members", method=RequestMethod.GET)
	public String getMembers() {
		
		List<Member> list = repository.selectAll();
		System.out.println(list);
		
		return "memberList";
	}
	
	@RequestMapping(value="/members2", method=RequestMethod.GET)
	public String getMembers2() {
		
		List<Map<String, Object>> list = repository.selectAll2();
		System.out.println(list);
		
		return "memberList";
	}
	
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String getMember() {
		
		Member m = repository.selectOne("test02");
		System.out.println(m);
		
		return "memberList";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String  insert( @ModelAttribute  Member member) {		
		int result  =repository.insert(member) ;
		System.out.println( result);	
		
		return "memberList";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String  update( @ModelAttribute  Member member) {		
		int result  =repository.update(member) ;
		System.out.println( result);	
		
		return "memberList";
		
	}
	
	@RequestMapping(value="/deleteOne", method=RequestMethod.GET)
	public String deleteOne(@RequestParam String id) {
		int result = repository.deleteOne(id);
		System.out.println(result);
		
		return "memberList";
	}
	
	@RequestMapping(value="/deleteAll", method=RequestMethod.GET)
	public String deleteAll(@RequestParam String id) {
		int result = repository.deleteAll();
		System.out.println(result);
		
		return "memberList";
	}
	
}
