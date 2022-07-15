package com.example.press.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.press.dto.ContentDto;
import com.example.press.model.entity.Content;
import com.example.press.model.repository.ContentRepository;
import com.example.press.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {
	
	private final ContentRepository contentRepository;
	
	@Autowired
	public ContentServiceImpl(ContentRepository contentRepository) {
		this.contentRepository = contentRepository;
	}

	@Override
	public List<Content> getAll() {
		return contentRepository.findAll();
	}

	@Override
	public Content getById(Integer contentsid) {
		return contentRepository.getById(contentsid);
	}

	@Override
	public Content create(Content content, ContentDto contentDto) {
		content = new Content();
		content.setPublicationName(contentDto.getPublicationName());
		content.setContent(contentDto.getContent());
		return contentRepository.saveAndFlush(content);
	}

	@Override
	public void delete(Content content) {
		contentRepository.delete(content);
	}

	@Override
	public List<Content> search(String keyword) {
		return null;
	}

}
