package com.acon.prac4;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController2 {
	
	String fileDir="c:\\test\\upload\\";
	
	//입력폼
	@RequestMapping(value="/upload2", method=RequestMethod.GET)
	public String uploadForm() {
		
		return "upload2";
	}
	
	//실제파일 업로드하기
	@RequestMapping(value="/upload2", method=RequestMethod.POST)
	public String upload(String goodsName, MultipartFile file, Model model) throws IllegalStateException, IOException {
		
		String fileName = file.getOriginalFilename();
		String filePath = fileDir+fileName;
		
		file.transferTo(new File(filePath));
		
		model.addAttribute("img", fileName);
		
		return "upload2Ok";
	}
	// c:\\test\\upload => 파일업로드
	// aws - s3버킷 => 파일업로드
	
	// 저장된 이미지 보여주기	(서버의 특정 자원을 응답하기)
	// images/aaa.jpg => path variable 방식
	
	@ResponseBody
	@RequestMapping(value="/images/{fileName:.*}", method=RequestMethod.GET)
	public Resource image(@PathVariable String fileName) throws MalformedURLException {
		
		System.out.println(fileName);
		
		return new UrlResource("file:c:\\test\\upload\\"+fileName);
	}
	
	
}
