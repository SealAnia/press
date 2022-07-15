package com.example.press.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.press.model.entity.Magazine;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Integer> {

}
