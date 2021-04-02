package com.ltts.Rental.Controller;

import org.springframework.stereotype.Controller;
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
public class CarController {

	
	@Autowired
	private CarRepo carrepo;
	private BookingRepo bookrepo;
	
	@GetMapping("/cars/new")
	public String showNewCarForm(Model model) {
		/* List<Booking> listBooking=bookrepo.findAll(); */
		
		model.addAttribute("car",new Car());
		/* model.addAttribute("listBooking",listBooking); */
		return "car";
	}
	@PostMapping("/car/save")
	public String saveCar(Car car) {
		carrepo.save(car);
		
		return "redirect:/";
	}
	@GetMapping("/cars")
	public String listCars(Model model) {
		List<Car> listCars=carrepo.findAll();
		model.addAttribute("listCars",listCars);
		return "cars";
		
	}
	

}
