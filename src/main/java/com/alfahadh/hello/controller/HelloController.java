package com.alfahadh.hello.controller;

import com.alfahadh.hello.model.MessageResponse;
import com.alfahadh.hello.service.HelloService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public ResponseEntity<MessageResponse> hello(@RequestParam(defaultValue = "World") String name) {
        return ResponseEntity.ok(helloService.getMessage(name));
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/info")
    public ResponseEntity<MessageResponse> info(@RequestParam(defaultValue = "World") String name) {
        // same as hello but kept for an explicit info endpoint used by probes
        return ResponseEntity.ok(helloService.getMessage(name));
    }
}
