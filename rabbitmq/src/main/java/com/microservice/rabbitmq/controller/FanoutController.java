package com.microservice.rabbitmq.controller;

import com.microservice.rabbitmq.model.QueueObject;
import com.microservice.rabbitmq.model.Response;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@RestController
@RequestMapping("/api")
public class FanoutController {

    @Autowired
    private AmqpTemplate fanoutExchange ;

    @PostMapping("/fanout")
    public ResponseEntity<Response> sendMessageWithDirectExchange()
    {
        QueueObject object = new QueueObject("fanout" , LocalDateTime.now());
        fanoutExchange.convertAndSend(object);
        return new ResponseEntity<Response>(new Response("Fanout Excahnge"), HttpStatus.OK) ;
    }
}
