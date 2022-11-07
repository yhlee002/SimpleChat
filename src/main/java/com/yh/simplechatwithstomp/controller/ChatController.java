//package com.yh.simplechatwithstomp.controller;
//
//import org.springframework.messaging.Message;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class ChatController {
//
//    @MessageMapping("/chat")
//    @SendTo("/pub/chat")
//    public Message chat(Message message) {
//        return message;
//    }
//}
