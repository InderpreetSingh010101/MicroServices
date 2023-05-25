package com.microservice.rabbitmq.controller;

import com.microservice.rabbitmq.model.QueueObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class DefaultController {

    @Autowired
    private AmqpTemplate defaultExchange ;

    @PostMapping("/default")
    public ResponseEntity<String> sendMessageDefaultExchange(){
        QueueObject object = new QueueObject("default" , LocalDateTime.now()) ;
        defaultExchange.convertAndSend(object);
        return new ResponseEntity<>("sent" , HttpStatus.OK) ;
    }
}
