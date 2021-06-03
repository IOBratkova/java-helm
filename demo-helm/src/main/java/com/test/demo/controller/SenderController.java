package com.test.demo.controller;

import com.test.demo.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(path = "")
@RequiredArgsConstructor
@Log4j2
public class SenderController {

    private final MessageService service;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/messages")
    public void produce(@RequestParam("msg")String msg){
        service.send(msg);
        log.info("controller send: " + msg);
    }

}
