package xyz.xile.mq.rabitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: chenqi
 * @Date: 2019.4.4 14:55
 */
@Component
@RabbitListener(queues = "topic.messages")
public class HelloReceiverD {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("接受方D收到消息: " + hello);
    }




}
