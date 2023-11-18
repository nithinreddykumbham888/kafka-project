package com.springboot.kafkademoconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics = "kafka_two", groupId = "user-group")
	public void consumerOne(String producer2) {
		System.out.println(producer2);
	}
	
	@KafkaListener(topics = "kafka-one", groupId = "user-group")
	public void consumerTwo(String producer1) {
		System.out.println(producer1);
	}

}
