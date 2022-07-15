package com.example.press.service;

import com.example.press.dto.ArticleDto;
import com.example.press.dto.AuthorDto;
import com.example.press.dto.ContentDto;
import com.example.press.dto.MagazineDto;
import com.example.press.model.entity.Article;
import com.example.press.model.entity.Author;
import com.example.press.model.entity.Content;
import com.example.press.model.entity.Magazine;

public interface ArticleService extends DefaultService<Article> {

	Article create(Article article, ArticleDto articleDto, Content content, ContentDto contentDto,
			Author author, AuthorDto authorDto, Magazine magazine, MagazineDto magazineDto);
	
	Article update(Article article, ArticleDto articleDto, Content content, ContentDto contentDto, 
			Author author, AuthorDto authorDto, Magazine magazine, MagazineDto magazineDto);

}
