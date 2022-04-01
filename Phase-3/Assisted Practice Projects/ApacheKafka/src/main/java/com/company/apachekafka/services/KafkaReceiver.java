package com.company.apachekafka.services;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaReceiver {
	
	@KafkaListener(topics="Simplilearn", groupId="group1")
	public void consume(String message) {
		System.out.println("Consumed message:"+message);
	}
	
	@KafkaListener(topics="Simplilearn", groupId="group2")
	public void consume111(String message) {
		System.out.println("Consumed message111:"+message);
	}
}
