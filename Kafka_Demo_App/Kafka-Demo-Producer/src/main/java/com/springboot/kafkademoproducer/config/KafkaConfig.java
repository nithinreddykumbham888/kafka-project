package com.springboot.kafkademoproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.springboot.kafkademoproducer.appconstant.AppConstant;

@Configuration
public class KafkaConfig {
	
	

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name(AppConstant.KAFKA_ONE).build();
	}
	
	@Bean
	public NewTopic topicOne() {
		return TopicBuilder.name(AppConstant.KAFKA_TWO).build();
	}

}
