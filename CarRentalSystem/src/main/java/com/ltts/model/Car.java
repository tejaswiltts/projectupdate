package com.ltts.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Car implements Serializable {
	
	
	
	@Id
	private int car_id;
	private String name;
	private String cname;
	private String ctype;
	private float price;
	private String rnum;
	private int year;
	private String color;
	
	
	@OneToMany(mappedBy="car")
	private List<Booking> booked;
	public int getCar_id() {
		return car_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Booking> getBooked() {
		return booked;
	}
	public void setBooked(List<Booking> booked) {
		this.booked = booked;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public Car(int car_id, String name, String cname, String ctype, float price, String rnum, int year, String color) {
		super();
		this.car_id = car_id;
		this.name = name;
		this.cname = cname;
		this.ctype = ctype;
		this.price = price;
		this.rnum = rnum;
		this.year = year;
		this.color = color;
		this.booked = booked;
	}
	
	public Car() {
		super();
	}
	
	@Override
	public String toString() {
		return "Car [car_id=" + car_id + "]";
	}
		
	
	
	
}