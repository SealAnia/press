package com.example.press.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.press.dto.ArticleDto;
import com.example.press.dto.AuthorDto;
import com.example.press.dto.ContentDto;
import com.example.press.dto.MagazineDto;
import com.example.press.model.entity.Article;
import com.example.press.model.repository.ArticleRepository;
import com.example.press.service.impl.ArticleServiceImpl;
import com.example.press.service.impl.AuthorServiceImpl;
import com.example.press.service.impl.ContentServiceImpl;
import com.example.press.service.impl.MagazineServiceImpl;

@Controller
public class ArticleController {
	
	private final ArticleServiceImpl articleService;
	private final ArticleRepository articleRepository;
	private final AuthorServiceImpl authorService;
	private final ContentServiceImpl contentService;
	private final MagazineServiceImpl magazineService;
	
	@Autowired
	public ArticleController(ArticleServiceImpl articleService, 
			ArticleRepository articleRepository,
			AuthorServiceImpl authorService, 
			ContentServiceImpl contentService, 
			MagazineServiceImpl magazineService) {
		this.articleService = articleService;
		this.articleRepository = articleRepository;
		this.authorService = authorService;
		this.contentService = contentService;
		this.magazineService = magazineService;
	}
	
	@GetMapping(value = "/articles")
	public String getAllArticles(Model model) {
		//var articles = articleService.getAll();
		var articles = articleRepository.findAll(Sort.by(Direction.DESC, "dateOfPublication"));
		model.addAttribute("articles", articles);
		return "article/articles";
	}
	
	@GetMapping(value = "/articles/{articleid}")
	public String getArticle(@PathVariable Integer articleid, Model model) {
		var article = articleService.getById(articleid);
		model.addAttribute("article", article);
		return "content/magazine_content";
	}
	
	@GetMapping(value = "/showarticleform") 
	public String showCreateArticle(Model model) {
		model.addAttribute("article", new ArticleDto());
		
		var contents = contentService.getAll();
		model.addAttribute("contents", contents);
		
		var magazines = magazineService.getAll();
		model.addAttribute("magazines", magazines);
		
		var authors = authorService.getAll();
		model.addAttribute("authors", authors);
		
		return "article/create_article";
	}
	
	@PostMapping(value = "/articles")
	public String addArticle
	(@RequestParam(value = "authorid") Integer authorid, 
			@RequestParam(value = "contentsid") Integer contentsid, 
			@RequestParam(value = "magazineid") Integer magazineid, 
			@ModelAttribute("article") ArticleDto articleDto, 
			@ModelAttribute("magazine") MagazineDto magazineDto, 
			@ModelAttribute("author") AuthorDto authorDto, 
			@ModelAttribute("content") ContentDto contentDto,
			Model model) {
		var article = new Article();
		var author = authorService.getById(authorid);
		var content = contentService.getById(contentsid);
		var magazine = magazineService.getById(magazineid);
		article.setDateOfPublication(articleDto.getDateOfPublication());
		articleService.create(article, articleDto, content, contentDto, author, authorDto, magazine, magazineDto);
		return "redirect:/articles";
	}
	
	@GetMapping(value="/showeditarticle/{articleid}")
	public String showEditArticle(@PathVariable("articleid") Integer articleid, 
			@ModelAttribute(name = "newArticle") Article newArticle, Model model) {
		var article = articleService.getById(articleid);
		var contents = contentService.getAll();
		model.addAttribute("contents", contents);
		
		var magazines = magazineService.getAll();
		model.addAttribute("magazines", magazines);
		
		var authors = authorService.getAll();
		model.addAttribute("authors", authors);
		
		return "article/update_article";
	}
	
	@PostMapping(value = "/editarticle")
	public String editArticle
	(@RequestParam(value = "authorid") Integer authorid, 
			@RequestParam(value = "contentsid") Integer contentsid, 
			@RequestParam(value = "magazineid") Integer magazineid, 
			@ModelAttribute("article") ArticleDto articleDto, 
			@ModelAttribute("magazine") MagazineDto magazineDto, 
			@ModelAttribute("author") AuthorDto authorDto, 
			@ModelAttribute("content") ContentDto contentDto,
			Model model) {
		var article = articleService.getById(articleDto.getArticleid());
		
		var author = authorService.getById(authorid);
		var content = contentService.getById(contentsid);
		var magazine = magazineService.getById(magazineid);
		
		articleService.update(article, articleDto, content, contentDto, author, authorDto, magazine, magazineDto);
		return "redirect:/articles";
	}
	
	@GetMapping(value = "/articles/searchresults")
	public String searchOnPage(@RequestParam String keyword, Model model) {
		var results = articleService.search(keyword);
		model.addAttribute("results", results);
		return "article/searchresult";
	}
	
	@GetMapping(value = "/deletearticleinfo/{articleid}")
	public String deleteArticle(@PathVariable("articleid") Integer articleid) {
		var article = articleService.getById(articleid);
		articleService.delete(article);
		return "article/delete_article";
	}
	
}
