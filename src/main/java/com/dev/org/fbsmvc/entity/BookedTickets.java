package com.dev.org.fbsmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booked_tickets")
public class BookedTickets {
	
	@Id
	private Integer bookingId;
	private Integer flightDetails;
	private Integer returnFlightDetails;
	private Integer PNRNumber;
	private Integer mobileNo;
	private String email;
	private Double onewayFare;
	private Double returnFare;
	private String journeyDate;
	private String returnJourneyDate;
	@Column(name="SEATS")
	private Integer seats;
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	private int id;
	
	public BookedTickets() {
		super();
	}
	public BookedTickets(Integer bookingId, Integer flightDetails, Integer returnFlightDetails, Integer pNRNumber,
			Integer mobileNumber, String email, Double oneWayFare, Double returnFare, String journeyDate,
			String returnJourneyDate, Integer seats, int id) {
		super();
		this.bookingId = bookingId;
		this.flightDetails = flightDetails;
		this.returnFlightDetails = returnFlightDetails;
		PNRNumber = pNRNumber;
		this.mobileNo = mobileNumber;
		this.email = email;
		this.onewayFare = oneWayFare;
		this.returnFare = returnFare;
		this.journeyDate = journeyDate;
		this.returnJourneyDate = returnJourneyDate;
		this.seats = seats;
		this.id = id;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(Integer flightDetails) {
		this.flightDetails = flightDetails;
	}
	public Integer getReturnFlightDetails() {
		return returnFlightDetails;
	}
	public void setReturnFlightDetails(Integer returnFlightDetails) {
		this.returnFlightDetails = returnFlightDetails;
	}
	public Integer getPNRNumber() {
		return PNRNumber;
	}
	public void setPNRNumber(Integer pNRNumber) {
		PNRNumber = pNRNumber;
	}
	public Integer getMobileNumber() {
		return mobileNo;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNo = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getOnewayFare() {
		return onewayFare;
	}
	public void setOnewayFare(Double oneWayFare) {
		this.onewayFare = oneWayFare;
	}
	public Double getReturnFare() {
		return returnFare;
	}
	public void setReturnFare(Double returnFare) {
		this.returnFare = returnFare;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getReturnJourneyDate() {
		return returnJourneyDate;
	}
	public void setReturnJourneyDate(String returnJourneyDate) {
		this.returnJourneyDate = returnJourneyDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BookedTickets [bookingId=" + bookingId + ", flightDetails=" + flightDetails + ", returnFlightDetails="
				+ returnFlightDetails + ", PNRNumber=" + PNRNumber + ", mobileNumber=" + mobileNo + ", email="
				+ email + ", oneWayFare=" + onewayFare + ", returnFare=" + returnFare + ", journeyDate=" + journeyDate
				+ ", returnJourneyDate=" + returnJourneyDate + ", seats=" + seats + ", id=" + id + "]";
	}
	
	
	

}
