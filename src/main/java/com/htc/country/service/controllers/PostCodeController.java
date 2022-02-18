package com.htc.country.service.controllers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
/*
 * PostCodeController is REST API based controller class to get list of 
 * records and insert new records in to the database\
 * This Microservice using H2 database
 * 
 */
@RestController
public class PostCodeController {
	
	/* 
	 * This is PostCodeService to fetch the records from repository
	 * 
	 */
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
	 * return result list will be in Sorted by Alphabetically
	 */
	
	@GetMapping("/{postcode}")
	public List<Suburbs> getSuburbs(@PathVariable String postcode) {
		List<Suburbs>  suburbsList = postcodeService.get(postcode);
		List<Suburbs> suburbsSorted = suburbsList.stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList());
		return suburbsSorted;			
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