package xyz.xile.mq.rabitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: chenqi
 * @Date: 2019.4.4 14:55
 */
@Component
@RabbitListener(queues = "topic.message")
public class HelloReceiverC {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("接受方C收到消息: " + hello);
    }




}
