package com.springboot.cabservicedriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.springboot.cabservicedriver.constant.AppConstant;

@Configuration
public class KafkaConfig {



//	Creating a Topic Command
//	$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
	
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name(AppConstant.CAB_LOCATION).build();
	}
}
