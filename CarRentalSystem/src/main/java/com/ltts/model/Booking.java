package com.ltts.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int car_id;
	
	private String email_id;
	private String booking_date;
	private int days;
	private String status;
	
	

	
	@ManyToOne
	private Car car;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Car Status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
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

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	

	public void setStatus(Car status) {
		Status = status;
	}

	public Booking(long id, int car_id, String email_id, String booking_date, int days, String status, Car car,
			Car status2) {
		super();
		this.id = id;
		this.car_id = car_id;
		this.email_id = email_id;
		this.booking_date = booking_date;
		this.days = days;
		this.status = status;
		this.car = car;
	
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", car_id=" + car_id + ", email_id=" + email_id + ", booking_date=" + booking_date
				+ ", days=" + days + ", status=" + status + ", car=" + car + ", Status=" + Status + "]";
	}
	

	
}