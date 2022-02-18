package com.htc.country.service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.country.service.entities.Suburbs;

public interface PostCodeRepository extends JpaRepository <Suburbs, String> {

	/*
	 * Repository method to fetch  the records based on postcode from the database
	 */
	public List<Suburbs> findBypostcode(String postcode);
	
	
}
