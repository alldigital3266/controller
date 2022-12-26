package com.mook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mook")
public class BoardController {
	
//	@RequestMapping(value = "/sample", method = RequestMethod.GET )  //http://localhost:80/mook/sample
//	@PostMapping(value = "/sample") @DeleteMapping @PutMapping -> REST Service
	@GetMapping(value = "/sample")
	public String getData() {
		return "sample"; //views/sample.jsp
	}
	
	@RequestMapping(value = "/name")  
	public String getName() {
		return "name"; 
	}

	@RequestMapping(value = "/member") 
	public String getMember() {
		return "name"; 
	}


}
