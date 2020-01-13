package xyz.xile.mq.rabitmq;

/**
 * @Author: chenqi
 * @Date: 2019.4.4 14:54
 */

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "你好 RabitMQ!";
        System.out.println("发送方发送消息: " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
