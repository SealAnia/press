package com.example.press.service;

import java.util.List;

public interface DefaultService<T> {
	
	List<T> getAll();
	T getById(Integer id);
	void delete(T entity);
	List<T> search(String keyword);
	
}
