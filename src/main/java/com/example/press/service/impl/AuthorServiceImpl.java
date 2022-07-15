package com.example.press.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.press.model.entity.Author;
import com.example.press.model.repository.AuthorRepository;
import com.example.press.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	private final AuthorRepository authorRepository;
	
	@Autowired
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	public List<Author> getAll() {
		return authorRepository.findAll();
	}

	@Override
	public Author getById(Integer authoridid) {
		return authorRepository.getById(authoridid);
	}
	
	@Override
	public void delete(Author author) {
		authorRepository.delete(author);
	}

	@Override
	public List<Author> search(String keyword) {
		return null;
	}

}
