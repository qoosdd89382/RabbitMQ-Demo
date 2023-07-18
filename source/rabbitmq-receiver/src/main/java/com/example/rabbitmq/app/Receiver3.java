//package com.example.rabbitmq.app;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Receiver3 {
//    @RabbitListener(queues = "teste")
//    public void onMessage(Message message, Channel channel) throws Exception {
//        try {
//            String receivedMessage = new String(message.getBody());
//            System.out.println(" Receiver3 Received '" + receivedMessage + "' but system crashed.");
//            // system crashing..
//            throw new Exception("<system error>");
//        } catch (Exception e) {
//            System.out.println(" [x] Receiver3 error processing message: " + e.getMessage());
//            boolean shouldRequeue = true;  // Determine this based on the type of exception.
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, shouldRequeue);
//        }
//    }
//}
