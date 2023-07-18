//package com.example.rabbitmq.app;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Receiver2 {
//    @RabbitListener(queues = "teste")
//    public void onMessage(Message message, Channel channel) throws Exception {
//        try {
//            String receivedMessage = new String(message.getBody());
//            System.out.println(" Receiver2 Received '" + receivedMessage + "'  but I didn't process it. so let's requeue this");
//            // Acknowledge the message.
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
//        } catch (Exception e) {
//            System.out.println(" [x] Receiver2 error processing message: " + e.getMessage());
//            boolean shouldRequeue = true;  // Determine this based on the type of exception.
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, shouldRequeue);
//        }
//    }
//}
