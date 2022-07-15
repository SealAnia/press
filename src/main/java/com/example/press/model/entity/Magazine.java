package com.example.press.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "magazine")
public class Magazine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer magazineid;
	@Column
	private String name;
	@OneToMany(mappedBy = "magazine", cascade = CascadeType.ALL, 
			orphanRemoval = false)
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
