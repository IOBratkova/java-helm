package com.test.demo.controller;

import com.test.demo.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "")
public class HelloController {


    @GetMapping(path = "/hello")
    public ResponseEntity<String> produce(){
        return ResponseEntity.ok("Hellow");
    }

}
