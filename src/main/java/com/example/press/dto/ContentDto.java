package com.example.press.dto;

import com.example.press.model.entity.Article;

public class ContentDto {
	
	private Integer contentsid;
	private String publicationName;
	private String content;
	private Article article;
	
	public Integer getContentsid() {
		return contentsid;
	}
	public void setContentsid(Integer contentsid) {
		this.contentsid = contentsid;
	}
	public String getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}

}
