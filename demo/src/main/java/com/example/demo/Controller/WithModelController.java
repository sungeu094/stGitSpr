package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WithModelController {
	@GetMapping("/member/member")
	public String Info() {
		
		return "/member/member";
	}
	
	@GetMapping("/member/member_data")
	public String userData(Model model) {
		model.addAttribute("model_Data", "Data");
		return "/member/Data_member";
	}
	
	@GetMapping("/member/member_data1")
	public String userData1() {
		return "/member/Data_member";
	}
}
