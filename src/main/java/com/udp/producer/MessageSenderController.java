package com.udp.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageSenderController {

    @Autowired
    UdpClient client;

    @RequestMapping("/send")
    public String send(){
        client.sendMessage("test Message");
        return "sent";
    }
}
