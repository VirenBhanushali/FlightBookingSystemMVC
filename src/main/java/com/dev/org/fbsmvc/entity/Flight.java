package com.dev.org.fbsmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {

	@Id
	private Integer flightNumber;
	private String airline;
	private String source;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String instrumentUsed;
	private Boolean vegFood;
	private Boolean nonVegFood;
	private String logo;
	private Boolean blocked;
	private Double rate;
	private Integer id;
	private Boolean monday;
	private Boolean tuesday;
	private Boolean wednesday;
	private Boolean thursday;
	private Boolean friday;
	private Boolean saturday;
	private Boolean sunday;
	
	
	
	
	
	
	public Flight() {
		super();
	}
//	public Flight(Integer flightNumber, String airline, String source, String destination, String departureTime,
//			String arrivalTime, String instrumentUsed, Boolean vegFood, Boolean nonVegFood, String logo,
//			Boolean blocked, Double price, Integer id, Boolean monday, Boolean tuesday, Boolean wednesday,
//			Boolean thursday, Boolean friday, Boolean saturday, Boolean sunday) {
//		super();
//		this.flightNumber = flightNumber;
//		this.airline = airline;
//		this.source = source;
//		this.destination = destination;
//		this.departureTime = departureTime;
//		this.arrivalTime = arrivalTime;
//		this.instrumentUsed = instrumentUsed;
//		this.vegFood = vegFood;
//		this.nonVegFood = nonVegFood;
//		this.logo = logo;
//		this.blocked = blocked;
//		this.rate = price;
//		this.id = id;
//		this.monday = monday;
//		this.tuesday = tuesday;
//		this.wednesday = wednesday;
//		this.thursday = thursday;
//		this.friday = friday;
//		this.saturday = saturday;
//		this.sunday = sunday;
//	}
	
	
	
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public Boolean getVegFood() {
		return vegFood;
	}
	public void setVegFood(Boolean vegFood) {
		this.vegFood = vegFood;
	}
	public Boolean getNonVegFood() {
		return nonVegFood;
	}
	public void setNonVegFood(Boolean nonVegFood) {
		this.nonVegFood = nonVegFood;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Boolean getBlocked() {
		return blocked;
	}
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getMonday() {
		return monday;
	}
	public void setMonday(Boolean monday) {
		this.monday = monday;
	}
	public Boolean getTuesday() {
		return tuesday;
	}
	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}
	public Boolean getWednesday() {
		return wednesday;
	}
	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}
	public Boolean getThursday() {
		return thursday;
	}
	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}
	public Boolean getFriday() {
		return friday;
	}
	public void setFriday(Boolean friday) {
		this.friday = friday;
	}
	public Boolean getSaturday() {
		return saturday;
	}
	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}
	public Boolean getSunday() {
		return sunday;
	}
	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airline=" + airline + ", source=" + source + ", Destination="
				+ destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", instrumentUsed=" + instrumentUsed + ", vegFood=" + vegFood + ", nonVegFood=" + nonVegFood
				+ ", logo=" + logo + ", blocked=" + blocked + ", price=" + rate + ", id=" + id + ", monday=" + monday
				+ ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday
				+ ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}
}
