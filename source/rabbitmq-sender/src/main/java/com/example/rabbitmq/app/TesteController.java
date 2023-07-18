package com.example.rabbitmq.app;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
    private final Sender sender;

    @Autowired
    public TesteController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/test")
    public String testSend() {
        sender.send("this is a test message, time=" + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return "test MQ sender demo";
    }
}
