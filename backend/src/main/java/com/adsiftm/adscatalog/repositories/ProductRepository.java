package com.adsiftm.adscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adsiftm.adscatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
