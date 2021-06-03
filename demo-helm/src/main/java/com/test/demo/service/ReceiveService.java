package com.test.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
@Log4j2
@RequiredArgsConstructor
public class ReceiveService {

    private final MessageService messageService;

    @JmsListener(destination = "${jms.queue.destination}")
    public void receiveMessage(String msg) throws JMSException {
        messageService.receive(msg);
        log.info("receive service: " + msg);
    }
}
