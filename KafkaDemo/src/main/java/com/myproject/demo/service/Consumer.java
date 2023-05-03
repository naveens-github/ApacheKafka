package com.myproject.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "codeDecode_Topic", groupId = "codeDecode_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("The message is received"+receivedMessage);
    }
}
