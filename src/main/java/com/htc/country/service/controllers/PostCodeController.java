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

import com.htc.country.service.entities.Suburbs;
import com.htc.country.service.services.PostCodeService;

@RestController
public class PostCodeController {
	

	@Autowired
	private PostCodeService postcodeService;
	/* 
	 * get all the records by hiting http://localhost:8080/ 
	 * 	in the browser
	 */
	@GetMapping("/")
	public List<Suburbs> getAll() {
		return postcodeService.all();
	}
	/* 
	 * Fetching Suburbs list  based on postcode  by hiting the URL http://localhost:8080/postcode 
	 * 	in the browser
	 */
	
	@GetMapping("/{postcode}")
	public List<Suburbs> getSuburbs(@PathVariable String postcode) {
		List<Suburbs>  countryEnitity = postcodeService.get(postcode);
		return countryEnitity;			
	}
	
	/* 
	 * insert list of new records by hitting the URL http://localhost:8080/addNewRecord
	 * in the browser
	 */
	@RequestMapping(value="/addrecord", method=RequestMethod.POST)
		public List<Suburbs> addNewRecord(@RequestBody List<Suburbs> newRecord){
		return postcodeService.save(newRecord);
	}	
}