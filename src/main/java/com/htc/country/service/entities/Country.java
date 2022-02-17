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
public class Country {
	
	@Id
	private String state;
	
	@Column 
	@NotNull
	private String postcode;

	
	@Column 
	@NotNull
	private String suburb;

	
	
	
	
	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getState() {
		return state;
	}

	
	public void setCountry(String state) {
		this.state = state;
	}

	
	
}
