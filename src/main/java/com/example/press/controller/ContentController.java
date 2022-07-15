package com.example.press.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.press.dto.ContentDto;
import com.example.press.model.entity.Content;
import com.example.press.service.impl.ContentServiceImpl;

@Controller
public class ContentController {
	
	private final ContentServiceImpl contentService;
	
	@Autowired
	public ContentController(ContentServiceImpl contentService) {
		this.contentService = contentService;
	}
	
	@GetMapping(value = "/showcontentform")
	public String showCreateContent(Model model) {
		model.addAttribute("content", new ContentDto());
		return "content/add_content";
	}
	
	@PostMapping(value = "/showcontentform/")
	public String addProduct(@ModelAttribute("content") ContentDto contentDto, Model model) {
		var content = new Content();
		contentService.create(content, contentDto);
		return "redirect:/showcontentform";
	}

}
