package com.htc.country.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.country.service.entities.Suburbs;
import com.htc.country.service.exceptions.NotFoundException;
import com.htc.country.service.repositories.PostCodeRepository;

@Service
public class PostCodeService {
	
	@Autowired
	private PostCodeRepository postcodeRepository;
	
	
	public List<Suburbs> all() {
		List<Suburbs> countries = new ArrayList<>();
		postcodeRepository.findAll().forEach(countries::add);
		
		return countries;
	}
	
	
	public List<Suburbs> get(String postcode) {
		return postcodeRepository.findBypostcode(postcode);
	}	
	
	public List<Suburbs> save(List<Suburbs> entity) {
		return postcodeRepository.saveAll(entity);
		
	}
	
	public boolean delete(String country) {
		postcodeRepository.deleteById(country);
		
		return true;
	}
}
