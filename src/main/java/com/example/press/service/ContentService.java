package com.example.press.service;

import com.example.press.dto.ContentDto;
import com.example.press.model.entity.Content;

public interface ContentService extends DefaultService<Content> {
	
	public Content create(Content content, ContentDto contentDto);

}
