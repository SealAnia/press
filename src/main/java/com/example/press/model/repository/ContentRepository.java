package com.example.press.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.press.model.entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

}
