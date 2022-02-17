package com.htc.country.service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.country.service.entities.Country;

public interface PostCodeRepository extends JpaRepository <Country, String> {

	public List<Country> findBypostcode(String postcode);
	
	
}
