package com.example.press.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.press.service.impl.AuthorServiceImpl;

@Controller
public class AuthorController {
	
	private final AuthorServiceImpl authorService;
	
	@Autowired
	public AuthorController(AuthorServiceImpl authorService) {
		this.authorService = authorService;
	}
	
	@GetMapping(value = "/authors")
	public String getAllAuthors(Model model) {
		var authors = authorService.getAll();
		model.addAttribute("authors", authors);
		return "author/authors";
	}

}
