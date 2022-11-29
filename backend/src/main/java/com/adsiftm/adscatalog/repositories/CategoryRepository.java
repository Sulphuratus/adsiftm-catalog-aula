package com.adsiftm.adscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adsiftm.adscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
