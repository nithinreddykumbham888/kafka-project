package com.springboot.cabservicedriver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cabservicedriver.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {
	
	@Autowired
	private CabLocationService cabLocationService;
	
	@GetMapping("/welcome")
	public String helloMessage() {
		return "Welcome to Rentals cab Service, this is a driver page";
	}
	
	@PutMapping("/publish")
	public ResponseEntity updateLocation() throws InterruptedException {
		
		int number = 100;
		while(number>=0) {
			cabLocationService.updateLocation(Math.random() + " "+Math.random());
			Thread.sleep(2000);
			number--;
		}
		
		return new ResponseEntity<>(Map.of("Message","Update Location"), HttpStatus.OK);
	}

}
