package com.microservice.rabbitmq.controller;

import com.microservice.rabbitmq.model.QueueObject;
import com.microservice.rabbitmq.model.Response;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private AmqpTemplate topicExchange ;

    @PostMapping("/topic/{key}")
    public ResponseEntity<Response> sendMessageWithDirectExchange(@PathVariable String key)
    {
        QueueObject object = new QueueObject("topic" , LocalDateTime.now());
        topicExchange.convertAndSend(key , object);
        return new ResponseEntity<Response>(new Response("Topic Exchange"), HttpStatus.OK) ;
    }
}
