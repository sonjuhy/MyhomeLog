package com.myhome.log.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerImpl {

    private static final String TOPIC_TEST = "exam-topic";

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        System.out.println("Produce message : "+message);
        this.kafkaTemplate.send(TOPIC_TEST, message);
    }
}
