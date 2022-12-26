package com.mook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mook.controller.vo.MemberVO;

@Controller
@RequestMapping(value = "/object/")  // 주소:포트/context-path/object/

public class ObjectTestController {

	@RequestMapping(value = "/")  // 주소:포트/context-path/object/ + / (/ 중첩시 제거함)
	@ResponseBody
	public List<MemberVO> aaa() {  //반환되는 타입이 VO객체 (String or void)

		List<MemberVO> list = new ArrayList<MemberVO>();
		
		System.out.println("화면이 나옵니다");
		MemberVO vo = new MemberVO();
		vo.setAaa("kim");
		vo.setBbb("lee");
		vo.setCcc("park");
		vo.setDdd("choi");
		vo.setEee(4);
		
		list.add(vo);
		
		vo.setAaa("kim1");
		vo.setBbb("lee1");
		vo.setCcc("park1");
		vo.setDdd("choi1");
		vo.setEee(4111);

		list.add(vo);

		for(MemberVO i : list) {
			System.err.println(i.toString());
		}
		
		return list;
		
	}
}
