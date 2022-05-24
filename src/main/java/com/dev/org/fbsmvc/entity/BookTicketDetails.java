package com.dev.org.fbsmvc.entity;

public class BookTicketDetails {

	private Integer flightNumber;
	private String email;
	private Integer seats;
	private Integer mobileNo;
	
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "BookTicketDetails [flight=" + flightNumber + ", email=" + email + ", seats=" + seats + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
}
