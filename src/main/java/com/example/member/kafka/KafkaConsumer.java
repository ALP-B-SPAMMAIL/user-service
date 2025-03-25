package com.example.member.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "member", groupId = "member")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
