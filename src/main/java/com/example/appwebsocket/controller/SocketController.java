package com.example.appwebsocket.controller;

import com.example.appwebsocket.dto.MessageBean;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public MessageBean send(@Payload MessageBean message) {
        return message;
    }
}