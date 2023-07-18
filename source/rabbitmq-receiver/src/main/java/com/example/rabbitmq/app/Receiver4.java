//package com.example.rabbitmq.app;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Receiver4 {
//    @RabbitListener(queues = "teste")
//    public void onMessage(Message message, Channel channel) throws Exception {
//        try {
//            String receivedMessage = new String(message.getBody());
//            System.out.println(" Receiver4 Received '" + receivedMessage + "'");
//            System.out.println(" Receiver4 doing somethings.....");
//            // Acknowledge the message.
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        } catch (Exception e) {
//            System.out.println(" [x] Receiver4 error processing message: " + e.getMessage());
//            // You might want to take further action, such as logging the error, sending a notification, etc.
//            // Depending on the nature of the error, you may want to either requeue the message or send it to a dead-letter queue.
//            boolean shouldRequeue = true;  // Determine this based on the type of exception.
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, shouldRequeue);
//        }
//    }
//}
