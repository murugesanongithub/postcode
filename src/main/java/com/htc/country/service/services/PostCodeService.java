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
	
	/*
	 * Service method to fetch all the records from the database
	 */
	public List<Suburbs> all() {
		List<Suburbs> countries = new ArrayList<>();
		postcodeRepository.findAll().forEach(countries::add);
		
		return countries;
	}
	
	/*
	 * Service method to fetch  the records based on postcode from the database
	 */
	public List<Suburbs> get(String postcode) {
		return postcodeRepository.findBypostcode(postcode);
	}	
	
	/*
	 * Service method to insert list of records into the database
	 */
	public List<Suburbs> save(List<Suburbs> entity) {
		return postcodeRepository.saveAll(entity);
		
	}
	/*
	 * Service method to delete  the records based on postcode from the database
	 */
	public boolean delete(String postcode) {
		postcodeRepository.deleteById(postcode);
		
		return true;
	}
}
