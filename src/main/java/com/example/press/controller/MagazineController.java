package com.example.press.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.press.service.impl.MagazineServiceImpl;

@Controller
public class MagazineController {
	
	private final MagazineServiceImpl magazineService;
	
	@Autowired
	public MagazineController(MagazineServiceImpl magazineService) {
		this.magazineService = magazineService;
	}
	
	@GetMapping(value = "/magazines")
	public String getAllMagazines(Model model) {
		var magazines = magazineService.getAll();
		model.addAttribute("magazines", magazines);
		return "magazine/magazines";
	}

}
