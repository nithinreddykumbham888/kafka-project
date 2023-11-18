package com.springboot.kafkademoproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.springboot.kafkademoproducer.appconstant.AppConstant;

@Service
public class KafkaProducerService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean kafkaProducerOne(String producer1) {
		
		kafkaTemplate.send(AppConstant.KAFKA_ONE, producer1);
		
		return true;
	}
	
public boolean kafkaProducerTwo(String producer2) {
		
		kafkaTemplate.send(AppConstant.KAFKA_TWO, producer2);
		
		return true;
	}

}
