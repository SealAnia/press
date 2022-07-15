package com.example.press.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.press.model.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
