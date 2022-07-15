package com.example.press.service.impl;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.press.dto.ArticleDto;
import com.example.press.dto.AuthorDto;
import com.example.press.dto.ContentDto;
import com.example.press.dto.MagazineDto;
import com.example.press.model.entity.Article;
import com.example.press.model.entity.Author;
import com.example.press.model.entity.Content;
import com.example.press.model.entity.Magazine;
import com.example.press.model.repository.ArticleRepository;
import com.example.press.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	private final ArticleRepository articleRepository;
	
	private final ContentServiceImpl contentService;
	private final AuthorServiceImpl authorService;
	private final MagazineServiceImpl magazineService;
	
	@Autowired
	public ArticleServiceImpl(ArticleRepository articleRepository, 
			ContentServiceImpl contentService, 
			AuthorServiceImpl authorService, 
			MagazineServiceImpl magazineService) {
		this.articleRepository = articleRepository;
		this.contentService = contentService;
		this.authorService = authorService;
		this.magazineService = magazineService;
	}

	@Override
	public List<Article> getAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article getById(Integer articleid) {
		return articleRepository.getById(articleid);
	}

	@Override
	public Article create(Article article, ArticleDto articleDto, 
			Content content, ContentDto contentDto, 
			Author author, AuthorDto authorDto, 
			Magazine magazine, MagazineDto magazineDto
			) {
		article = new Article();
		
		content = contentService.getById(content.getContentsid());
		article.setContent(content);
		
		magazine = magazineService.getById(magazine.getMagazineid());
		article.setMagazine(magazine);
		
		author = authorService.getById(author.getAuthorid());
		article.setAuthor(author);
		
		article.setDateOfPublication(articleDto.getDateOfPublication());
		return articleRepository.saveAndFlush(article);
	}

	@Override
	public Article update(Article article, ArticleDto articleDto, 
			Content content, ContentDto contentDto, 
			Author author, AuthorDto authorDto, 
			Magazine magazine, MagazineDto magazineDto) {
		article = articleRepository.getById(article.getArticleid());
		
		content = contentService.getById(content.getContentsid());
		article.setContent(content);
		
		magazine = magazineService.getById(magazine.getMagazineid());
		article.setMagazine(magazine);
		
		author = authorService.getById(author.getAuthorid());
		article.setAuthor(author);
		
		if(articleDto.getDateOfPublication() == null) {
			article.setDateOfPublication(article.getDateOfPublication());
		}
		else if (articleDto.getDateOfPublication() != null) {
			article.setDateOfPublication(articleDto.getDateOfPublication());
		}
		
		Date date = new Date();
		article.setLastDateOfEdition(date);
		
		Time time = new Time(date.getTime());
		article.setLastTimeOfEdition(time);
		
		return articleRepository.saveAndFlush(article);
	}
	
	@Override
	public void delete(Article article) {
		articleRepository.delete(article);
	}

	@Override
	public List<Article> search(String keyword) {
		return articleRepository.search(keyword);
	}

}
