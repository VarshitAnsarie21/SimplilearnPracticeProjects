package com.company.apachekafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
private static final String SIMPLILEARN_TOPIC = "Simplilearn";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String message) {
		kafkaTemplate.send(SIMPLILEARN_TOPIC, message);
	}
}
