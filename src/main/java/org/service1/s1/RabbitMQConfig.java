package org.service1.s1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue pinQueue() {
        return new Queue("pinQueue", true);
    }

    @Bean
    public Queue ponQueue() {
        return new Queue("ponQueue", true);
    }
}
