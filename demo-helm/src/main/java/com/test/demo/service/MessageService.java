package com.test.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MessageService {
    @Value("${jms.queue.destination}")
    private String queue;

    private final JmsTemplate jmsTemplate;

    public MessageService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(String msg) {
        jmsTemplate.send(queue, session -> session.createTextMessage(msg));
        log.info("service send message: " + msg);
    }

    public void receive(String msg) {
        log.info("service receive message: " + msg);
    }

}
