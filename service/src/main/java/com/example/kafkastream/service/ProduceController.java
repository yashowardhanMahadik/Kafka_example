package com.example.kafkastream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.stream.Stream;

@Controller
public class ProduceController {

    @Autowired
    KafkaProducerService producerService;

    @GetMapping("/publish/{message}")
    ResponseEntity<?> publishMessage(@PathVariable String message){
        try {
            producerService.sendMessage(message);
            return ResponseEntity.ok("ReSponse added ");
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/bulk")
    ResponseEntity<?> publishBulk() {
        try {
            for (int i = 1; i < 10000; i++) {
//                Thread.sleep(200);
                producerService.sendMessage(" Bulk message : "+i);
                System.out.println(" Bulk message : "+i);
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok("Bulk message sent");
    }
}
