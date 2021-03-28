package com.ltts.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Dao.BookingDao;
import com.ltts.Dao.CarDao;
import com.ltts.Dao.PaymentDao;
import com.ltts.Dao.UserDao;
import com.ltts.model.Booking;
import com.ltts.model.Car;
import com.ltts.model.Payment;
import com.ltts.model.User;


@SessionAttributes({ "id" })

@RestController
public class AppController {
	
	@Autowired
	UserDao ud;
	
	@Autowired
	CarDao cd;
	
	@Autowired
	BookingDao bd;
	
	@Autowired
	PaymentDao pd;
	
	
	@RequestMapping("")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/registration")
	public ModelAndView registerUser() {
		return new ModelAndView("registration");
	}
	
	
	@RequestMapping("/login")
	public ModelAndView loginuser() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/addbook")
	public ModelAndView book() {
		
		
		return new ModelAndView("booking");
		 
	}
	
	@RequestMapping(value="/complete", method=RequestMethod.POST)
	public ModelAndView addcheck(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String FName=req.getParameter("firstname");
		String Email=req.getParameter("email");
		String UName=req.getParameter("address");
		String city=req.getParameter("city");
		int Zip = Integer.parseInt(req.getParameter("zip"));
		String Cname=req.getParameter("cardname");
		int Cnumber = Integer.parseInt(req.getParameter("cardnumber"));
		int month = Integer.parseInt(req.getParameter("expmonth"));
		int year = Integer.parseInt(req.getParameter("expyear"));
		int CVV = Integer.parseInt(req.getParameter("cvv"));
		String Total =req.getParameter("total");
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Payment p=new Payment(FName,Email,UName,city,Zip,Cname,Cnumber,month,year,CVV,Total);
		System.out.println("***** INSIDE CONTROLLER ****"+p);
		boolean b=pd.InsertPay(p);
		
		if(b==false) {
			mv=new ModelAndView("invoice");
			model.addAttribute("message","Car Booked Successfully");
		}
		else {
			String message = "New user created successfully";
			mv=new ModelAndView("Payment");
			model.addAttribute("msg",message );
			
		}
		return mv;
	}
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
	      Long id=Long.parseLong("id");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String first_name=req.getParameter("first_name");
		String last_name=req.getParameter("last_name");
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		User u=new User(id,email,password,first_name,last_name);
		System.out.println("***** INSIDE CONTROLLER ****"+ud);
		boolean b=ud.InsertUser(u);
		
		if(b==false) {
			mv=new ModelAndView("login");
			model.addAttribute("");
		}
		else {
			String message = "New user created successfully";
			mv=new ModelAndView("error");
			model.addAttribute("msg",message );
			
		}
		/*
		 * try { b=md.InsertMember(m); mv=new ModelAndView("success"); } catch(Exception
		 * e) {
		 * 
		 * mv=new ModelAndView("error"); }
		 */
		
		
		return mv;
	}
	

	
	@RequestMapping(value="/addbooking", method=RequestMethod.POST )
	public ModelAndView booking(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		int bid=Integer.parseInt(req.getParameter("Bid"));
		int miid=Integer.parseInt(req.getParameter("miid"));
		
		
		int bseats=Integer.parseInt(req.getParameter("bseats"));
		
		
	  
		
	
		
		 
		  Car c = (Car)cd.getCarByID(car_id); 
		  
		  double p= c.getPrice();
		  String name=c.getCname();
		  
	
		Booking bo=new Booking(Id,Car_id,Email_id,Booking_date,Days,Status,null,null,null);
		
		System.out.println("***** INSIDE CONTROLLER ****"+bo);
		boolean b=bd.InsertBooking(bo);
		
		if(b==false) {
			mv=new ModelAndView("payment");
		
			model.addAttribute("name", name);
			model.addAttribute("status", b);
			
			
			
			
		
		}
		else {
			String message = "booking done";
			//mv=new ModelAndView("login");
			model.addAttribute("msg",message );
			
		}
	
		
		return mv;
	}


	
	@RequestMapping(value="checkuser", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, Model model)
	{
		ModelAndView mv=null;
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		User u =ud.checkUser(email);
	//	Car c= cd.getAllCars()
        List<Car> li =cd.getAllCars();
		
		model.addAttribute("list", li);
		
		//return mv;
	
		
		
		if(u.getPassword().equals(password)){
			model.addAttribute("name",u.getId());
			mv=new ModelAndView("addMovie");
			 //List<Car> li =mod.getAllCars();
				
			
				model.addAttribute("list", li);
				
				//return mv;
			
			
		}
			else {
				mv=new ModelAndView("error");
				model.addAttribute("msg", "Incorrect credentials");
				
			}
		
		return mv;
			
		}
	
}

