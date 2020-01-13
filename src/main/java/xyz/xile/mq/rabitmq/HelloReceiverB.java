package xyz.xile.mq.rabitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: chenqi
 * @Date: 2019.4.4 14:55
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiverB {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("接受方B收到消息: " + hello);
    }




}
