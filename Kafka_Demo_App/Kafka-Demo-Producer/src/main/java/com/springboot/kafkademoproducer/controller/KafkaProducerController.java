package com.springboot.kafkademoproducer.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kafkademoproducer.service.KafkaProducerService;

@RestController
@RequestMapping("/producer")
public class KafkaProducerController {
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@PutMapping("/kafkaone")
	public ResponseEntity kafkaProducerOne() throws InterruptedException {
		
		int a = 50;
		while(a>0) {
			
			kafkaProducerService.kafkaProducerOne(Math.random() + " " +a +" "+Math.random());
			Thread.sleep(500);
			a--;
		}
		
		return new ResponseEntity<>(Map.of("Message","producer one"),HttpStatus.OK);
	}
	
	@PutMapping("/kafkatwo")
	public ResponseEntity kafkaProducerTwo() throws InterruptedException {
		
		int b = 70;
		while(b>0) {
			
			kafkaProducerService.kafkaProducerTwo(Math.random() + " " +b +" "+Math.random());
			Thread.sleep(500);
			b--;
		}
		
		return new ResponseEntity<>(Map.of("Message","producer two"),HttpStatus.OK);
	}

}
