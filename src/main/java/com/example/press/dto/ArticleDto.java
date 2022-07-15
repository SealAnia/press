package com.example.press.dto;

import java.util.Date;

import com.example.press.model.entity.Author;
import com.example.press.model.entity.Content;
import com.example.press.model.entity.Magazine;

public class ArticleDto {
	
	private Integer articleid;
	private Content content;
	private Date dateOfPublication;
	private Magazine magazine;
	private Author author;
	
	public Integer getArticleid() {
		return articleid;
	}
	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public Date getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	public Magazine getMagazine() {
		return magazine;
	}
	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

}
