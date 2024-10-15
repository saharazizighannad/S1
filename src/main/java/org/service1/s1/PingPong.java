package org.service1.s1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class PingPong {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 10000)
    public void sendPing() {
        System.out.println("S1: Sending ping message...");
        rabbitTemplate.convertAndSend("pinQueue", "ping");
    }

    @RabbitListener(queues = "ponQueue")
    public void receivePong(String message) throws InterruptedException {
        System.out.println("S1: Received '" + message + "'");
        Thread.sleep(10000); // Wait for 10 seconds
        System.out.println("S1: Sending pong message...");
        rabbitTemplate.convertAndSend("pinQueue", "pong");
    }
}
