package com.tutorial.HibernateTutorial.cache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	private int countryId;
	
	private String countryName;
	
	public Country() {}
	
	public Country(int countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	
}
