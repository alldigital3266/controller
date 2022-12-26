package com.mook.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mook.controller.vo.MemberVO;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/sangpum/*")  //test/sangpum/*
	public void getRequest() {
		
	}
	@RequestMapping(value="/employee/*")  //test/sangpum/*
	public void getEmployee() {
		
	}
	@RequestMapping(value="/inputData") 
	public String getInputData(MemberVO vo, Model model, HttpSession session, HttpServletRequest res) {
		
		model.addAttribute("vo", vo); // == request.setAttribute("vo", vo);
		session.setAttribute("loginInfo", vo);
		
		/*
		System.out.println(vo.getAaa());
		System.out.println(vo.getBbb());
		System.out.println(vo.getCcc());
		System.out.println(vo.getDdd());
		System.out.println(vo.getEee()+55);
	
		model.addAttribute("vo", vo);*/
		return "inputData";
	}

	@RequestMapping(value="/aaaa") //localhost/test/aaaa?data1=123&data2=gildong&aaa=aa&bbb=bb&ccc=cc&ddd=dd&eee=ee
	public String d(@ModelAttribute("data1") int data1, @ModelAttribute("data2") String data2, MemberVO vo) {
		//model.addAttribute("data1", data1);
		//model.addAttribute("data2", data2);
		
		System.out.println("data1= " + data1);
		System.out.println("data2= " + data2);
		return "aaaa";   //WEB-INF/views/aaaa.jsp
	}
	
	@RequestMapping(value="/bbb")  //localhost/test/bbb?aaa=10&aaa=20&aaa=30&bbb=40&ccc=50
	public String bbb(@RequestParam("aaa") int[] aaa, int bbb, int ccc) {
		
		for(int a : aaa) {
			System.out.println(a);
			
		}
		
		System.out.println( bbb);
		System.out.println( ccc);
		
		return "bbbb";   //WEB-INF/views/bbbb.jsp
	}

}
