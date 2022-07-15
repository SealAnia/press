package com.example.press.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.press.model.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	@Query(value = "SELECT a FROM Article a WHERE a.articleid LIKE '%' || :keyword || '%' "
			+ "OR a.dateOfPublication LIKE '%' || :keyword || '%' "
			+ "OR a.content.publicationName LIKE '%' || :keyword || '%' "
			+ "OR a.content.content LIKE '%' || :keyword || '%' "
			+ "OR a.magazine.name LIKE '%' || :keyword || '%' "
			+ "OR a.author.name LIKE '%' || :keyword || '%' "
			+ "OR a.author.surname LIKE '%' || :keyword || '%'")
	List<Article> search(@Param("keyword") String keyword);

}
