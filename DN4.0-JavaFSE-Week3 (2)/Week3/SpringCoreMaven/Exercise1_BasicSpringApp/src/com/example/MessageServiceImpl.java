package com.example;

public class MessageServiceImpl implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }
}
