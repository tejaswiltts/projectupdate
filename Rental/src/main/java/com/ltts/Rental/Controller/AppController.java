package com.ltts.Rental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
 @GetMapping("")
 public String ViewHomePage() {
	 return "index";
 }
}
