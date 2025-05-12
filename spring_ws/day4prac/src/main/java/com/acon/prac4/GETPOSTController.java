package com.acon.prac4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class GETPOSTController {
	
	@RequestMapping(value="/formView", method=RequestMethod.GET)
	public String form() {
		
		
		
		return "formView";
	}
	
	//get 요청
	//a태그, url직접요청, form의 method="get" => get요청
	//자바스크립트 location.href=""
	//요청시 보내는 데이터는 요청라인에 쿼리스트링으로 제공됨
	//서버가 주로 제공하는 서비스틀은 get요청으로 처리한다
	
	@RequestMapping(value="/form1", method=RequestMethod.GET)
	public String form1(HttpServletRequest request) {
		
		//GET 요청 데이터
		//request 객체의 getParameter()메서드로 얻어옴
		//=> 스퓨ㅡ링에서는 @RequestParam
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		
		System.out.println("id: "+id+" pw: "+pw);
		//http
		//요청라인( 한 줄)
		//요청헤드
		//빈줄
		//요청바디
		
		int length = request.getContentLength();
		
		System.out.println(length);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/form2", method=RequestMethod.POST)
	public String form2(HttpServletRequest request) throws IOException {
		
		// form, post => getParameter("id") 데이터 얻어올 수 있다, 요청바디의 내용을 읽어서 맵 형태로 제공함
		/*
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("id: "+id+" pw: "+pw);
		*/
		
		BufferedReader br = new BufferedReader( new InputStreamReader(request.getInputStream()));
		String line ="";
		StringBuilder builder = new StringBuilder();
		while((line=br.readLine())!=null) {
			builder.append(line);
		}
		
		System.out.println(builder.toString());
		
		return "redirect:/";
	}
	
}
