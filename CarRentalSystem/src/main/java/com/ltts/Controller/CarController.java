package com.ltts.Controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Dao.CarDao;
import com.ltts.model.Car;



@SessionAttributes({ "userName" })

@RestController
public class CarController {
	@Autowired
	CarDao cd;
	
	@RequestMapping(value="addcar", method=RequestMethod.POST)
	public ModelAndView addCar(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		int Car_id=Integer.parseInt(req.getParameter("car_id"));
		String Name=req.getParameter("name");
		String Cname=req.getParameter("cname");
		String Ctype=req.getParameter("ctype");
		float price = Float.parseFloat(req.getParameter("price"));
		String Rnum=req.getParameter("rnum");
		int Year=Integer.parseInt("year");
		String Color=req.getParameter("color");
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Car c=new Car(Car_id,Name,Cname,Ctype,price,Rnum,Year,Color);
		System.out.println("***** INSIDE CONTROLLER ****"+c);
		boolean b=cd.InsertCar(c);
		
		if(b==true) {
			mv=new ModelAndView("Booking");
			model.addAttribute("message","Car Booked Successfully");
		}
		else {
			String message = "New user created successfully";
			mv=new ModelAndView("Bookings");
			model.addAttribute("msg",message );
			
		}
		return mv;
	}
}
