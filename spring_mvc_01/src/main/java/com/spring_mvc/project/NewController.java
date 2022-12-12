package com.spring_mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	@RequestMapping("/")
	public String home() {
		return"home";
	}
	
	
	
	@RequestMapping("/newView")
	public String newView() {
		return"new/newView";
	}

}
