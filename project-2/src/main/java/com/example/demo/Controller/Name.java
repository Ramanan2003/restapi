package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	
		private String name="Ramanan";
		@RequestMapping("/second")
		public String Name() {
			return "Welcome "+name+"!";
			
		}
	}


