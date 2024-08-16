package com.ym.KafkaConsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerClass {
    Logger logger = LoggerFactory.getLogger("SampleLogger");

    @KafkaListener(topics = "YM_stream", groupId = "YM-group-3")
    public void consume(String message){
        logger.info("Consume message");
    }

    @KafkaListener(topics = "YMstream3", groupId = "YM-group-3")
    public void consume_text(String message){
        logger.info("Consume text message");
        System.out.println(" Tetxt message");
    }
}
