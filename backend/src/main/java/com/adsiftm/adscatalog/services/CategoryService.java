package com.adsiftm.adscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adsiftm.adscatalog.dto.CategoryDTO;
import com.adsiftm.adscatalog.entities.Category;
import com.adsiftm.adscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		
		//List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		// return listDto; // ao invés de declarar listDto e depois retorna-lo, pode retornar a expressao direto
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
			
		// Uma forma de converter lista Category para CategoryDTO usando for (Sem usar map e expressao Lambda)
		/*
		List<CategoryDTO> listDto = new ArrayList<>();
		for (Category cat : list) {
			listDto.add(new CategoryDTO(cat));
		}
		
		return listDto;*/
	}
	
}
