package com.ltts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.ltts.Dao.BookingDao;
import com.ltts.Dao.CarDao;


@SessionAttributes({ "userName" })

public class BookingController {
	@Autowired
	BookingDao bd;
	
	@Autowired
	CarDao cd;
	
	
	
	/*
	 * private Date Date(String parameter) { // TODO Auto-generated method stub
	 * return null; }
	 */

}

