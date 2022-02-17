package com.htc.country.service.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import com.htc.country.service.entities.Country;
import com.htc.country.service.services.PostCodeService;

@RestController
public class PostCodeController {
	

	@Autowired
	private PostCodeService postcodeService;
		
	@GetMapping("/")
	public List<Country> getAll() {
		return postcodeService.all();
	}
	
	@GetMapping("/{postcode}")
	public List<Country> getCountry(@PathVariable String postcode) {
		List<Country>  countryEnitity = postcodeService.get(postcode);
		return countryEnitity;			
	}
	
	@RequestMapping(value="/addrecord", method=RequestMethod.POST)
		public List<Country> addNewRecord(@RequestBody List<Country> newRecord){
		return postcodeService.save(newRecord);
	}	
}