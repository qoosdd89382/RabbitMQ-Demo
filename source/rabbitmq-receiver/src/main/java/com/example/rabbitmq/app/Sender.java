//package com.example.rabbitmq.app;
//
//import org.springframework.amqp.AmqpException;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Sender {
//
//    @Autowired
//    private RabbitTemplate template;
//
//    public void send(String message) {
//        try {
//            template.convertAndSend("teste-exchange", "routing-key-teste", message);
//            System.out.println(" Sent '" + message + "'");
//        } catch (AmqpException e) {
//            // Log and handle the exception properly in production environment.
//            System.out.println(" [x] Error sending message: " + e.getMessage());
//            // TODO: You might want to take further action, such as resending the message after a delay, sending a notification, stopping the application, etc.
//        }
//    }
//}
