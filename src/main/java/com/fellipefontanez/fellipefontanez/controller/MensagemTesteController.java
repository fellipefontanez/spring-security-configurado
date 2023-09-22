package com.fellipefontanez.fellipefontanez.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensagemTesteController {

    @MessageMapping("/mensagem")
    @SendTo("/topic/mensagem")
    public String greeting(String message) {
        return "Hello, "+  message + "!";
    }
}