package com.acon.prac4;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultiController {
	
	@RequestMapping(value="/uploadMulti", method=RequestMethod.GET)
	public String uploadForm() {
		
		return "multiForm";
	}
	
	@RequestMapping(value="/uploadMulti", method=RequestMethod.POST)
	public String upload(@RequestParam String goodsName, MultipartFile[] files) throws IllegalStateException, IOException {
		
		String dir = "c:\\test\\upload\\";
		
		System.out.println(goodsName);
		for(MultipartFile f:files) {
			String fileName = f.getOriginalFilename();
			String fullPath = dir+fileName;
			
			System.out.println(fullPath);
			
			f.transferTo(new File(fullPath));
			
		}
		
		return "multiOk";
	}
}
