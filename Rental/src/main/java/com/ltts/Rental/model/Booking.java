package com.ltts.Rental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String email_id;
	private String booking_date;
	private int many_days;
	private String Status;
	  
	  
    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car; 
	/* private float totalPrice = many_days **/
	  
	public Booking() {
		}
	  



	public Booking(String email_id, String booking_date, String status) {
		super();
		this.email_id = email_id;
		this.booking_date = booking_date;
		Status = status;
	}




	public Booking(int id, int many_days) {
		super();
		Id = id;
		
		this.many_days = many_days;
	}




	public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	public int getMany_days() {
		return many_days;
	}
	public void setMany_days(int many_days) {
		this.many_days = many_days;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}   
}


