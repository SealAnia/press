package com.example.press.dto;

import java.util.List;

import com.example.press.model.entity.Article;

public class AuthorDto {
	
	private Integer authorid;
	private String name;
	private String surname;
	private List<Article> articles;
	
	public Integer getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	

}
