package com.chellva.demo.hcl.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Theater {

	private String name;
	
	private String city;
	
	@Id
	private int pincode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
