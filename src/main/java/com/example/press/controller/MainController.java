package com.example.press.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	

	@GetMapping(value = "/main_page") 
	public String goToMainPage(Model model) {
		return "main_page";
	}
	

}
