package com.example.springbootmvc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "test", groupId = "group-id")
	public void consume(String message) {
		System.out.println("Consumed Message- " + message);
	}
}
