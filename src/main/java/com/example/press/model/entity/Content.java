package com.example.press.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contents")
public class Content {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contentsid;
	@Column(name = "publication_name")
	private String publicationName;
	@Column
	private String content;
	@OneToOne(mappedBy = "content")
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
