package com.security.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample/*")
@Controller
public class CommonController {
	@GetMapping("/all")
	public String doAll() {
		System.out.println("do all can acess everbody");
		return "all";
	}
	
	@GetMapping("/member")
	public String doMember() {
		System.out.println("logined member");
		return "member";
	}
	
	@GetMapping("/admin")
	public String doAdmin() {
		System.out.println("admin only");
		return "admin";
	}

}
