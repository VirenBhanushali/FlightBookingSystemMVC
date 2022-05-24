package com.dev.org.fbsmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers")
public class Passenger {
	
	@Id
	private String ID;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Meal_Preferance")
	private String mealPreferance;
	
	@Column(name="returnMeal_Preferance")
	private String returnMealPreferance;
	
	@Column(name="bookingId")
	private Integer bookingId;
	
	
	public Passenger(String name, int age, String gender, String mealPreferance, String returnMealPreferance , Integer bookingId) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mealPreferance = mealPreferance;
		this.returnMealPreferance = returnMealPreferance;
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMealPreferance() {
		return mealPreferance;
	}
	public void setMealPreferance(String mealPreferance) {
		this.mealPreferance = mealPreferance;
	}
	public String getReturnMealPreferance() {
		return returnMealPreferance;
	}
	public void setReturnMealPreferance(String returnMealPreferance) {
		this.returnMealPreferance = returnMealPreferance;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	
	

}
