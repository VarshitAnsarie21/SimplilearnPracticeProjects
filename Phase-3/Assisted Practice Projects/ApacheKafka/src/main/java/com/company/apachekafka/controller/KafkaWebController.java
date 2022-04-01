package com.company.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.apachekafka.services.KafkaSender;

@Controller
public class KafkaWebController {
	
	@Autowired
	KafkaSender kafkaSender;

	@GetMapping("/produce")
	public String produce(@RequestParam("message") String messsage) {

		kafkaSender.send(messsage);
		return "Message sent to kafka topic successfully!";
	}
}
