package xyz.xile.mq.rabitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: chenqi
 * @Date: 2019.4.4 14:49
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {

        return new Queue("hello");
    }
}
