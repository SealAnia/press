package com.example.press.model.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer articleid;
	@OneToOne
	@JoinColumn(name = "contentsid")
	private Content content;
	@Column(name = "date_of_publication")
	private Date dateOfPublication;
	@ManyToOne
	@JoinColumn(name = "magazineid")
	private Magazine magazine;
	@ManyToOne
	@JoinColumn(name = "authorid")
	private Author author;
	@Column(name = "date_of_edition")
	private Date lastDateOfEdition;
	@Column(name = "time_of_edition")
	private Time lastTimeOfEdition;
	
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
	public Date getLastDateOfEdition() {
		return lastDateOfEdition;
	}
	public void setLastDateOfEdition(Date lastDateOfEdition) {
		this.lastDateOfEdition = lastDateOfEdition;
	}
	public Time getLastTimeOfEdition() {
		return lastTimeOfEdition;
	}
	public void setLastTimeOfEdition(Time lastTimeOfEdition) {
		this.lastTimeOfEdition = lastTimeOfEdition;
	}

}
