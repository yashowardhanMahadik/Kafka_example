package com.ym.KafkaConsumer.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHttp {

    @GetMapping("/consume")
    ResponseEntity<?> consumeMessage(){
            return ResponseEntity.ok("Consume");
    }
}
