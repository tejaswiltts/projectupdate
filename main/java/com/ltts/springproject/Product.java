package com.ltts.springproject;

import javax.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int car_id;
@Column(length=45, nullable=false )
	  private String name;
	    private String cname;
	    private String ctype;
	    private float price;
	    private String rnum;
	    private int year;
	    private String color;
	   
	  


		public int getCar_id() {
			return car_id;
		}


		public void setCar_id(int car_id) {
			this.car_id = car_id;
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


		/*
		 * public Booking getBooking() { return booking; }
		 * 
		 * 
		 * public void setBooking(Booking booking) { this.booking = booking; }
		 */
	    
}
