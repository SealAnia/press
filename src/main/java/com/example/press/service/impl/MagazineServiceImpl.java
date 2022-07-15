package com.example.press.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.press.model.entity.Magazine;
import com.example.press.model.repository.MagazineRepository;
import com.example.press.service.MagazineService;

@Service
public class MagazineServiceImpl implements MagazineService {
	
	private final MagazineRepository magazineRepository;
	
	@Autowired
	public MagazineServiceImpl(MagazineRepository magazineRepository) {
		this.magazineRepository = magazineRepository;
	}

	@Override
	public List<Magazine> getAll() {
		return magazineRepository.findAll();
	}

	@Override
	public Magazine getById(Integer magazineid) {
		return magazineRepository.getById(magazineid);
	}

	@Override
	public void delete(Magazine magazine) {
		magazineRepository.delete(magazine);
	}

	@Override
	public List<Magazine> search(String keyword) {
		return null;
	}

}
