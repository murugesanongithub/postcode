package com.htc.country.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Suburbs {
	
	/*
	 * variable for state field 
	 */
	@Id
	private String state;
	
	/*
	 * variable for postcode field 
	 */
	@Column 
	@NotNull
	private String postcode;

	/*
	 * variable for suburb field 
	 */
	
	@Column 
	@NotNull
	private String suburb;

	
	
	/*
	 * getter method  for postcode field 
	 */
	
	public String getPostcode() {
		return postcode;
	}

	/*
	 * setter method  for postcode field 
	 */

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	/*
	 * getter method  for Subrub field 
	 */
	public String getSuburb() {
		return suburb;
	}


	/*
	 * setter method  for Suburb field 
	 */
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}


	/*
	 * getter method  for State field 
	 */
	
	public String getState() {
		return state;
	}

	/*
	 * setter method  for State field 
	 */
	
	public void setCountry(String state) {
		this.state = state;
	}

	
	
}
