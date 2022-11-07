package com.yh.simplechatwithstomp.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Component
public class TextMessageHandler extends TextWebSocketHandler {
    Set<WebSocketSession> sessions = new HashSet<>();

    Logger logger = LoggerFactory.getLogger(TextMessageHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
//        logger.debug("Connection Open.");
        System.out.println("Connection Open.");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        logger.info("receive message: " + message.getPayload());
        System.out.println("receive message: " + message.getPayload());
        session.sendMessage(new TextMessage("Hello, " + session.getId()));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
//        logger.error(exception.getMessage());
        System.out.println(exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.add(session);
//        logger.debug("Connection Closed.");
        System.out.println("Connection Closed.");
    }
}
