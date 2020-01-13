package xyz.xile.mq.rabitmq;

import xyz.xile.mq.rabitmq.topic.HelloSenderTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenqi
 * @Date: 2019.4.4 15:08
 */
@RestController
@RequestMapping("/rabitMQ")
@RefreshScope
public class RabitmqController {
    @Autowired
    private HelloSender helloSender;
    @Autowired
    private HelloSenderTopic helloSenderTopic;

    @RequestMapping("/testRabitMQ")
    public void testRabitMQ() throws Exception {
        helloSender.send();
    }

    @RequestMapping("/helloSenderTopic1")
    public void helloSenderTopic() throws Exception {
        helloSenderTopic.send1();
    }

    @RequestMapping("/helloSenderTopic2")
    public void helloSenderTopic2() throws Exception {
        helloSenderTopic.send2();
    }
}
