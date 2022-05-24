package com.dev.org.fbsmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airports")
public class Airport {
	@Id
	private String code;
	private String name;
	private String city;
	private String state;
	private String country;
	private String ICAO;
	
	
	public Airport(String code, String name, String city, String state, String country, String iCAO) {
		super();
		this.code = code;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		ICAO = iCAO;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


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


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getICAO() {
		return ICAO;
	}


	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}


	@Override
	public String toString() {
		return "Airport [code=" + code + ", name=" + name + ", city=" + city + ", state=" + state + ", country="
				+ country + ", ICAO=" + ICAO + "]";
	}
	
	
	
	
	

}
