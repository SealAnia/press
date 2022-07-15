package com.example.press.dto;

import java.util.List;

import com.example.press.model.entity.Article;

public class MagazineDto {
	
	private Integer magazineid;
	private String name;
	private List<Article> articles;
	
	public Integer getMagazineid() {
		return magazineid;
	}
	public void setMagazineid(Integer magazineid) {
		this.magazineid = magazineid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
