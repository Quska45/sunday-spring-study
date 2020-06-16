package com.security.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	@GetMapping("/accessError")
	public String doAll(Authentication auth, Model model) {
		System.out.println(auth);
		model.addAttribute("msg", "Access Denied");
		return "accessError";
	}
	
	@GetMapping("/customLogin")
	public String loginInput(String error, String logout, Model model) {
		System.out.println("error" + error);
		System.out.println("louout" + logout);
		
		if(error != null) {
			model.addAttribute("error", "Login Error Check Yout Account");
		}
		
		if(logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
		
		return "customLogin";
	}
}
