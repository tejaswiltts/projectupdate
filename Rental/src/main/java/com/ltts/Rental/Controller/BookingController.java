package com.ltts.Rental.Controller;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ltts.Rental.Repo.BookingRepo;
import com.ltts.Rental.Repo.CarRepo;
import com.ltts.Rental.model.Booking;
import com.ltts.Rental.model.Car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class BookingController {
	@Autowired
	private BookingRepo bookrepo;
	private CarRepo carrepo;
	@GetMapping("/booking")
	public String listBookings(Model model) {
		
		List<Booking> listBooking=bookrepo.findAll();
		model.addAttribute("listBooking",listBooking);
		return "booking";
	}
@GetMapping("/booking/new") 
public String showBookingNewForm(Model model) {
	List<Car> listCars=carrepo.findAll();
	
	model.addAttribute("car",listCars);
	model.addAttribute("booking",new Booking());
	return "new_booking";
}
@PostMapping("/booking/save")
public String saveBooking(Booking booking) {
	bookrepo.save(booking);
	return "redirect:/booking";
}
}
