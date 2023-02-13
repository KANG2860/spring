package com.spring_boot.projectEx.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot.projectEx.model.MemberVO;
import com.spring_boot.projectEx.service.MemberService;



@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 로그인 폼 열기
	@RequestMapping("/member/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	// 로그인 처리 : id와 pwd 전달 받아서 로그인 인증 완료 후 세션 설정
//	@ResponseBody
//@RequestMapping("/member/login")
	//public String loginCheck(@RequestParam HashMap<String, Object> param,
	//											HttpSession session) {
		// 로그인 체크 결과 
		//String memId = service.loginCheck(param);
		//String result = "fail";
		
		// 아이디와 비밀번호 일치하면 (로그인 성공하면)
//		if(memId != null) {
			//로그인 성공하면 세션 변수 지정
		//	session.setAttribute("sid", memId);
			//result = "success";
		//}
		
//		return result;
//	}
	@ResponseBody
	@RequestMapping("/member/login")
		public String loginCheck(@RequestParam HashMap<String, Object> param,
													HttpSession session) {
			//로그인 체크 결과 
			String result =service.loginCheck(param); //result:"success"또는 "fail"
			
			 //아이디와 비밀번호 일치하면 (로그인 성공하면)
			//서비스에서  "success" 반환받았으면
	        if(result.equals("success")) {
				//로그인 성공하면 세션 변수 지정
				session.setAttribute("sid", param.get("id"));
				result = "success";
			}
			
			return result;
		}
	
	@RequestMapping("/member/logout")
	public String loginOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/member/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	@RequestMapping("/member/insert")
	public String insert(MemberVO vo,
			        @RequestParam("memHp1")String memHp1,
			        @RequestParam("memHp2")String memHp2,
			        @RequestParam("memHp3")String memHp3) {
		vo.setMemHp(memHp1+"-"+memHp2+"-"+memHp3);
		service.insertMember(vo);
		return "member/loginForm";
	}
	
}