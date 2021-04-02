package com.ltts.Rental.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Rental.model.Booking;

public interface BookingRepo extends JpaRepository<Booking,Integer> {
	
	
	

}
