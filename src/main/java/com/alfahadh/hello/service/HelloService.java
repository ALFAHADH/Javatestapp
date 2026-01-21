package com.alfahadh.hello.service;

import com.alfahadh.hello.model.MessageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class HelloService {

    @Value("${app.env:dev}")
    private String environment;

    @Value("${app.version:0.0.0}")
    private String appVersion;

    public MessageResponse getMessage(String name) {
        String msg = "Hello " + name + " 👋";
        String timestamp = Instant.now().toString();
        return new MessageResponse(msg, environment, appVersion, timestamp);
    }
}
