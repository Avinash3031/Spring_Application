package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "helloworld";
//	}f
//	@RequestMapping("/processFormVersionTwo")
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		
//		String theName = request.getParameter("studentName");
//		theName = theName.toUpperCase();
//		String result = "hey" + theName;
//		model.addAttribute("messsage", result);
//		return "helloworld";
//		
//	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "hey how are you" + theName;
		model.addAttribute("messsage", result);
		return "helloworld";
		
	}

}
