package com.htc.country.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.country.service.entities.Country;
import com.htc.country.service.exceptions.NotFoundException;
import com.htc.country.service.repositories.PostCodeRepository;

@Service
public class PostCodeService {
	
	@Autowired
	private PostCodeRepository postcodeRepository;
	
	
	public List<Country> all() {
		List<Country> countries = new ArrayList<>();
		postcodeRepository.findAll().forEach(countries::add);
		
		return countries;
	}
	
	
	public List<Country> get(String postcode) {
		return postcodeRepository.findBypostcode(postcode);
	}	
	
	public List<Country> save(List<Country> entity) {
		return postcodeRepository.saveAll(entity);
		
	}
	
	public boolean delete(String country) {
		postcodeRepository.deleteById(country);
		
		return true;
	}
}
